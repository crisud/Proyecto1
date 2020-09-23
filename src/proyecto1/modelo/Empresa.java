package proyecto1.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USER
 */

@XmlRootElement(name = "Empresa")
public class Empresa implements Serializable
{
    public Empresa()
    {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        facturas = new ArrayList<>();

        soporte = new PropertyChangeSupport(this);
    }


    public void añadirObs(PropertyChangeListener pcl)
    {
        soporte.addPropertyChangeListener(pcl);
    }

    public void eliminarObs(PropertyChangeListener pcl)
    {
        soporte.removePropertyChangeListener(pcl);
    }

    public void agregarCliente(Cliente c)
    {
        soporte.firePropertyChange("clientes", null, c);
        getClientes().add(c);
    }

    public void agregarProducto(Producto p)
    {
        soporte.firePropertyChange("productos", null, p);
        getProductos().add(p);
    }

    public void agregarFactura(Factura f)
    {
        soporte.firePropertyChange("facturas", null, f);
        getFacturas().add(f);
    }

    public String getNombre()
    {
        return nombre;
    }

    @XmlElement(name = "nombre")
    public void setNombre(String nombre)
    {
        soporte.firePropertyChange("nombre", this.nombre, nombre);
        this.nombre = nombre;
    }

    public Cliente buscaCliente(String id)
    {
        if (getClientes().isEmpty())
        {
            return null;
        }
        for (Cliente c : getClientes())
        {
            if (c.getId().equals(id))
            {
                return c;
            }
        }
        return null;
    }

    public Producto buscaProducto(String codigo)
    {
        if (getProductos().isEmpty())
        {
            return null;
        }
        for (Producto p : getProductos())
        {
            if (p.getCodigo().equals(codigo))
            {
                return p;
            }
        }
        return null;
    }

    public Factura buscaFacura(int codigo)
    {
        if (getFacturas().isEmpty())
        {
            return null;
        }
        for (Factura f : getFacturas())
        {
            if (f.getCodigo() == codigo)
            {
                return f;
            }
        }
        return null;
    }

    public List<Producto> getProductos()
    {
        return productos;
    }

    //recuperar
    public void cargarEmpresa(String entrada) throws FileNotFoundException
    {
        try
        {
            JAXBContext ctx = JAXBContext.newInstance(Empresa.class);
            Unmarshaller mrs = ctx.createUnmarshaller();
            Empresa e = (Empresa) mrs.unmarshal(new FileInputStream(entrada));

            System.out.printf("e: %s%n", e);
            System.out.println();
        } catch (JAXBException ex)
        {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }

    //guardar
    public void guardarEmpresa(String salida)
    {
        try
        {
            JAXBContext ctx = JAXBContext.newInstance(Empresa.class);
            Marshaller mrs = ctx.createMarshaller();
            mrs.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            mrs.marshal(this, new FileOutputStream(salida));
            //mrs.marshal(this, System.out);

            //System.out.println();
        } catch (FileNotFoundException | JAXBException ex)
        {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }

    public List<Cliente> getClientes()
    {
        return clientes;
    }

    public List<Factura> getFacturas()
    {
        return facturas;
    }
    /*
      String nombreArchivo = "../datos6.xml";

        try {
            JAXBContext ctx = JAXBContext.newInstance(ConjuntoA.class);
            Marshaller mrs = ctx.createMarshaller();
            mrs.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            mrs.marshal(a, new FileOutputStream(nombreArchivo));
            mrs.marshal(a, System.out);

            System.out.println();
        } catch (FileNotFoundException | JAXBException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }

        try {
            JAXBContext ctx = JAXBContext.newInstance(ConjuntoA.class);
            Unmarshaller mrs = ctx.createUnmarshaller();
            ConjuntoA b = (ConjuntoA) mrs.unmarshal(new FileInputStream(nombreArchivo));

            System.out.printf("b: %s%n", b);
            System.out.println();
        } catch (FileNotFoundException | JAXBException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
     */

   
   
    @XmlElement(name = "productos")
    private List<Producto> productos;
    
    @XmlElement(name = "clientes")
    private List<Cliente> clientes;
    
   @XmlElement(name = "facturas")
    private List<Factura> facturas;

    @XmlTransient
    private final PropertyChangeSupport soporte;

    private String nombre;
}
