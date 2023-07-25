/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package japplicationb;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;

/**
 *
 * @author Usuario
 */
public class JFrmVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrmVentas
     */
    
    DefaultListModel listaControlCliente;
    DefaultListModel listaClientesFiltrados;
    
    public JFrmVentas() {
        initComponents();
        listaControlCliente = new DefaultListModel();
        LstClientes.setModel(listaControlCliente);
        
        listaClientesFiltrados = new DefaultListModel();
        LstClientesFiltrados.setModel(listaClientesFiltrados);
        
    }
    
    void CargaClientes(){
        
        try {
            
            for (Cliente oCliente : Main.ListadoClientes) {
                String IdeCliente = oCliente.getIdeCliente();
                String NomCliente = oCliente.getNomCliente();
                listaControlCliente.addElement(IdeCliente+" "+NomCliente);
                
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error registro cliente "+
                                        e.getMessage()+" "+
                                        e.getStackTrace()[0].toString());
        }
        
    }
    
    void CargarClientesFiltrados(){
         try {
            
            ArrayList<Cliente> ListaFiltrada = (ArrayList<Cliente>)Main.ListadoClientes.stream()
                                                .filter(cliente -> cliente.getTipoCliente() == 'V' )
                                                .collect(Collectors.toList());
                                                //.collect(Collectors.toList())
             
            for (Cliente oCliente : ListaFiltrada) {
                String IdeCliente = oCliente.getIdeCliente();
                String NomCliente = oCliente.getNomCliente();                
                listaClientesFiltrados.addElement(IdeCliente+" "+NomCliente);
                
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error registro cliente "+
                                        e.getMessage()+" "+
                                        e.getStackTrace()[0].toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnVerClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstClientes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        LstClientesFiltrados = new javax.swing.JList<>();

        setClosable(true);
        setTitle("Ventas");

        BtnVerClientes.setText("Ver Clientes");
        BtnVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerClientesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(LstClientes);

        jScrollPane2.setViewportView(LstClientesFiltrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(BtnVerClientes)
                    .addComponent(jScrollPane2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BtnVerClientes)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerClientesActionPerformed
        CargaClientes();
        CargarClientesFiltrados();
    }//GEN-LAST:event_BtnVerClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVerClientes;
    private javax.swing.JList<String> LstClientes;
    private javax.swing.JList<String> LstClientesFiltrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
