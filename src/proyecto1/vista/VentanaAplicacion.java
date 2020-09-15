/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.vista;

import java.util.Observable;
import java.util.Observer;
import proyecto1.control.ControlAplicacion;

/**
 *
 * @author USER
 */
public class VentanaAplicacion extends javax.swing.JFrame implements Observer
{

    /**
     * Creates new form VentanaAplicacion
     */
    public VentanaAplicacion(ControlAplicacion gestor)
    {
        this.gestor = gestor;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelEstado = new javax.swing.JPanel();
        etqEstado = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JTabbedPane();
        panelEmpresa = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        etqNomComercial = new javax.swing.JLabel();
        etqTipoId = new javax.swing.JLabel();
        etqNumId = new javax.swing.JLabel();
        etqUbicacion = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        etqFax = new javax.swing.JLabel();
        etqCorreoElec = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnEditar = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 2), new java.awt.Dimension(3, 2), new java.awt.Dimension(3, 2));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        campoNombre = new javax.swing.JTextField();
        campoNomComercial = new javax.swing.JTextField();
        campoTipoId = new javax.swing.JTextField();
        campoNumId = new javax.swing.JTextField();
        campoUbicacion = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoFax = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        etqEstado.setText("Por definir");
        panelEstado.add(etqEstado);

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        panelEmpresa.setToolTipText("");
        panelEmpresa.setLayout(new java.awt.GridBagLayout());

        etqNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelEmpresa.add(etqNombre, gridBagConstraints);

        etqNomComercial.setText("Nombre comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqNomComercial, gridBagConstraints);

        etqTipoId.setText("Tipo ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqTipoId, gridBagConstraints);

        etqNumId.setText("Numero ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqNumId, gridBagConstraints);

        etqUbicacion.setText("Ubicación:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqUbicacion, gridBagConstraints);

        etqTelefono.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqTelefono, gridBagConstraints);

        etqFax.setText("Fax:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqFax, gridBagConstraints);

        etqCorreoElec.setText("Correo Electronico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqCorreoElec, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        panelEmpresa.add(filler1, gridBagConstraints);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                modificarEmpresa(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        panelEmpresa.add(btnEditar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        panelEmpresa.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        panelEmpresa.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(filler4, gridBagConstraints);

        campoNombre.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoNombre, gridBagConstraints);

        campoNomComercial.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoNomComercial, gridBagConstraints);

        campoTipoId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoTipoId, gridBagConstraints);

        campoNumId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoNumId, gridBagConstraints);

        campoUbicacion.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoUbicacion, gridBagConstraints);

        campoTelefono.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoTelefono, gridBagConstraints);

        campoFax.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoFax, gridBagConstraints);

        campoCorreo.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoCorreo, gridBagConstraints);

        panelPrincipal.addTab("Empresa", panelEmpresa);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarEmpresa(java.awt.event.ActionEvent evt)//GEN-FIRST:event_modificarEmpresa
    {//GEN-HEADEREND:event_modificarEmpresa
        btnEditar.setText("Listo");
        editarCampos(true);
    }//GEN-LAST:event_modificarEmpresa

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VentanaAplicacion(new ControlAplicacion()).setVisible(true);
            }

        });
    }

    public void editarCampos(boolean estado)
    {
        campoCorreo.setEditable(estado);
        campoFax.setEditable(estado);
        campoNomComercial.setEditable(estado);
        campoNombre.setEditable(estado);
        campoNumId.setEditable(estado);
        campoTelefono.setEditable(estado);
        campoTipoId.setEditable(estado);
        campoUbicacion.setEditable(estado);

    }

    public void init()
    {
        gestor.registarObs(this);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoFax;
    private javax.swing.JTextField campoNomComercial;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumId;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTipoId;
    private javax.swing.JTextField campoUbicacion;
    private javax.swing.JLabel etqCorreoElec;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFax;
    private javax.swing.JLabel etqNomComercial;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNumId;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTipoId;
    private javax.swing.JLabel etqUbicacion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JPanel panelEmpresa;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JTabbedPane panelPrincipal;
    // End of variables declaration//GEN-END:variables

    private ControlAplicacion gestor;
}
