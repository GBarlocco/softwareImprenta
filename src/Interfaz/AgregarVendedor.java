package Interfaz;

import Lógica.Sistema;
import Lógica.ValidadorYConversor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class AgregarVendedor extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;
    
    public AgregarVendedor(Sistema sistema) {
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaVendedores(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        this.cargarListaVendedores();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subttlListaVendedores = new javax.swing.JLabel();
        scrollLista = new javax.swing.JScrollPane();
        listaNombresVendedores = new javax.swing.JList<>();
        btnCrearVendedor = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        ttlCrearVendedor = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCI = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblAnioDeIngreso = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtAnioDeIngreso = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Vendedor");
        setResizable(false);

        subttlListaVendedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subttlListaVendedores.setText("Lista Vendedores:");

        scrollLista.setViewportView(listaNombresVendedores);

        btnCrearVendedor.setText("Crear Vendedor");
        btnCrearVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVendedorActionPerformed(evt);
            }
        });

        separador.setForeground(new java.awt.Color(102, 102, 102));

        ttlCrearVendedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ttlCrearVendedor.setText("Crear Vendedor");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCI.setText("CI:");

        lblCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCelular.setText("Celular:");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDireccion.setText("Dirección:");

        lblAnioDeIngreso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAnioDeIngreso.setText("Año de Ingreso:");

        txtNombre.setEnabled(false);

        txtCI.setEnabled(false);
        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });

        txtCelular.setEnabled(false);
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        txtDireccion.setEnabled(false);

        txtAnioDeIngreso.setEnabled(false);
        txtAnioDeIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnioDeIngresoKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.setMaximumSize(new java.awt.Dimension(90, 23));
        btnGuardar.setMinimumSize(new java.awt.Dimension(90, 23));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(90, 23));
        btnCancelar.setMinimumSize(new java.awt.Dimension(90, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subttlListaVendedores)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnCrearVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(ttlCrearVendedor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCI, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblAnioDeIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAnioDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subttlListaVendedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ttlCrearVendedor)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCI))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblCelular))
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblDireccion))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblAnioDeIngreso))
                            .addComponent(txtAnioDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCrearVendedor)
                        .addContainerGap())))
            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardarVendedor();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCrearVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVendedorActionPerformed
        this.crearVendedor();
    }//GEN-LAST:event_btnCrearVendedorActionPerformed

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        ValidadorYConversor.inputInt(evt, this.txtCI.getText());
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        ValidadorYConversor.inputInt(evt, this.txtCelular.getText());
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtAnioDeIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnioDeIngresoKeyTyped
        ValidadorYConversor.inputInt(evt, this.txtAnioDeIngreso.getText());
    }//GEN-LAST:event_txtAnioDeIngresoKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        volverAListaVendedores();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public boolean validarCampos(String campoNombre, String campoCI, String campoCelular, String campoAnioDeIngreso, String campoDireccion){
        //VALIDAR EN OTRA CLASE
        boolean estaOk = false;

        //Se verifica que los campos no estén vacíos.
        if(ValidadorYConversor.validarCamposVacios(campoNombre, campoCI, campoCelular, campoAnioDeIngreso, campoDireccion)){
            
            estaOk = true;
            
        }

        return estaOk;
    }
    
    //Funciones principales de botones.
    public void crearVendedor(){
        //Desactivar y reactivar botones.
        btnCrearVendedor.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        //Activar campos de texto para ingresar cliente.
        txtNombre.setEnabled(true);
        txtCI.setEnabled(true);
        txtCelular.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtAnioDeIngreso.setEnabled(true);
    }
    
    public void guardarVendedor(){
        String campoNombre = txtNombre.getText();
        String campoCI = txtCI.getText();
        String campoCelular = txtCelular.getText();
        String campoAnioDeIngreso = txtAnioDeIngreso.getText();
        String campoDireccion = txtDireccion.getText();
        
        //Validamos que los campos no sean vacíos y que los numéricos contengan números.
        if(this.validarCampos(campoNombre, campoCI, campoCelular, campoAnioDeIngreso, campoDireccion)){
                //Tomamos los datos ingresados en los campos y creamos el cliente.
                String nombre = campoNombre;
                int CI = Integer.parseInt(campoCI);
                int celular = Integer.parseInt(campoCelular);
                int anioDeIngreso = Integer.parseInt(campoAnioDeIngreso);
                String direccion = campoDireccion;
                boolean seCreo = miSistema.altaVendedor(nombre, direccion, CI, celular, anioDeIngreso);
                
                if (seCreo){
                    JOptionPane.showMessageDialog(rootPane, "Se creó el vendedor correctamente.", "OPERACIÓN REALIZADA CON ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se pudo crear el vendedor.", "CÉDULA INVÁLIDA", JOptionPane.ERROR_MESSAGE);
                }

                //Actualizamos la lista de clientes y volvemos a la fase previa a crear cliente.
                this.cargarListaVendedores();
                this.volverAListaVendedores();

        } else{
            JOptionPane.showMessageDialog(rootPane, "Es posible que hayan campos vacíos", "CAMPOS SIN COMPLETAR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Carga la lista con los nombres de los vendedores.
    public void cargarListaVendedores(){
        String[] nuevaLista = miSistema.ordenadarListaPorCriterio( ValidadorYConversor.convertirVendedoresAPersonas( miSistema.getListaVendedores()), "criterioPorNombre" );
        listaNombresVendedores.setListData(nuevaLista);
    }

    //Resetea los campos texto y los deshabilita.
    //Deshabilita los botones de crear vendedor.
    //Y rehabilita los botones de la lista de vendedores.
    public void volverAListaVendedores(){
        //Desactivar y reactivar botones.
        btnCrearVendedor.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //Borrar contenido de los campos de texto.
        txtNombre.setText("");
        txtCI.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        txtAnioDeIngreso.setText("");
        
        //Desactivar campos de texto para ingresar vendedor.
        txtNombre.setEnabled(false);
        txtCI.setEnabled(false);
        txtCelular.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtAnioDeIngreso.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearVendedor;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblAnioDeIngreso;
    private javax.swing.JLabel lblCI;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> listaNombresVendedores;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel subttlListaVendedores;
    private javax.swing.JLabel ttlCrearVendedor;
    private javax.swing.JTextField txtAnioDeIngreso;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarListaVendedores();
    }
}