/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Lógica.Cliente;
import Lógica.Sistema;
import Lógica.Trabajo;
import Lógica.ValidadorYConversor;
import Lógica.Vendedor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class AltaIndividualDeTrabajo2 extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;
    public AltaIndividualDeTrabajo2(Sistema sistema, Cliente unCliente, Vendedor unVendedor) {
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaClientes(this);
        miSistema.aniadirComoListenerDeListaVendedores(this);
        miSistema.aniadirComoListenerDeListaTrabajos(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        cliente = unCliente;
        vendedor = unVendedor;
        txtID.setText("" + Trabajo.getId());
    }// AÑADIR LISTENER POR SI SE CREAN TRABAJOS DURANTE EL PROCESO.
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        scrollTxtArea = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnDarDeAlta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta Individual de Trabajo");
        setResizable(false);

        lblID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblID.setText("ID:");

        lblCosto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCosto.setText("Costo:");

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");

        txtID.setEnabled(false);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        scrollTxtArea.setViewportView(txtAreaDescripcion);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVolver.setText("<- Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnDarDeAlta.setText("Dar de Alta");
        btnDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarDeAltaActionPerformed(evt);
            }
        });

        jButton1.setText("Reestablecer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDarDeAlta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCosto)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(scrollTxtArea))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDarDeAlta)
                    .addComponent(btnVolver))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.habilitarIDPersonalizado();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AltaIndividualDeTrabajo1 nuevaVentana = new AltaIndividualDeTrabajo1(miSistema, this.cliente, this.vendedor);
        nuevaVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.deshabilitarIDPersonalizado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        ValidadorYConversor.inputFloat(evt);
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        ValidadorYConversor.inputInt(evt, this.txtID.getText());
    }//GEN-LAST:event_txtIDKeyTyped

    private void btnDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarDeAltaActionPerformed
        guardarTrabajo();
    }//GEN-LAST:event_btnDarDeAltaActionPerformed

    public boolean validarCampos(String id, String costo){ //VALIDAR EN OTRA CLASE
        boolean estaOk = false;

        //Se verifica que los campos no estén vacíos.
        if(ValidadorYConversor.validarCamposVacios(id, costo)){

            int intId = Integer.parseInt(id);
            float floatCosto = Float.parseFloat(costo);

            if((intId >= Trabajo.getId()) && (floatCosto > 0)){
                estaOk = true;
            }
        }

        return estaOk;
    }

    public void habilitarIDPersonalizado(){
        //Habilita el cambio de ID de trabajo.
        txtID.setEnabled(true);
    }
    
    public void deshabilitarIDPersonalizado(){
        //Reestablece el ID de trabajo el próximo en la lista e impide su modificación.
        txtID.setEnabled(false);
        actualizarID();
    }
    
    public void actualizarID(){
        //Setea el txt del ID al último número de trabajo.
        txtID.setText("" + Trabajo.getId());
    }

    public void guardarTrabajo(){
        String campoID = txtID.getText();
        String campoCosto = txtCosto.getText();
        String campoDescripcion = txtAreaDescripcion.getText();
        
        //Validamos que los campos no sean vacíos y que los numéricos contengan números.
        if(this.validarCampos(campoID, campoCosto)){

                //Tomamos los datos ingresados en los campos y creamos el cliente.
                int id = Integer.parseInt(campoID);
                float costo = Float.parseFloat(campoCosto);
                String descripcion = campoDescripcion;
                boolean esValido = miSistema.altaTrabajo(this.cliente, this.vendedor, id, costo, descripcion);
                
                if(!esValido){
                    JOptionPane.showMessageDialog(rootPane, "ID no valido", "ERROR ID", JOptionPane.ERROR_MESSAGE);
                }

                //Actualizamos la lista de clientes y volvemos a la fase previa a crear cliente.
                this.dispose();

        } else{
            JOptionPane.showMessageDialog(rootPane, "Es posible que hayan campos vacíos", "CAMPOS SIN COMPLETAR", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarDeAlta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID;
    private javax.swing.JScrollPane scrollTxtArea;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
    private Cliente cliente;
    private Vendedor vendedor;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(!txtID.isEnabled()){
            actualizarID();
        }
    }
}
