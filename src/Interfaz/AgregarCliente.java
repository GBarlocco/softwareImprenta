package Interfaz;

import Lógica.Persona;
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
public class AgregarCliente extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;

    //Constructor
    public AgregarCliente(Sistema sistema) {
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaClientes(this);
        miSistema.aniadirComoListenerDeListaTrabajos(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        this.cargarListaClientes();
        this.cargarComboBoxDepartamentos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        subttlListaClientes = new javax.swing.JLabel();
        radBtnOrdenarPorNombre = new javax.swing.JRadioButton();
        radBtnOrdenarPorMonto = new javax.swing.JRadioButton();
        scrollLista = new javax.swing.JScrollPane();
        listaNombresClientes = new javax.swing.JList<>();
        btnCrearCliente = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        ttlCrearCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCI = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblCodigoPostal = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        comboBoxDepartamentos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Cliente");
        setResizable(false);

        subttlListaClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subttlListaClientes.setText("Lista Clientes:");

        btnGroup.add(radBtnOrdenarPorNombre);
        radBtnOrdenarPorNombre.setSelected(true);
        radBtnOrdenarPorNombre.setText("Ordenar por Nombre");
        radBtnOrdenarPorNombre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radBtnOrdenarPorNombreStateChanged(evt);
            }
        });

        btnGroup.add(radBtnOrdenarPorMonto);
        radBtnOrdenarPorMonto.setText("Ordenar por Monto");

        scrollLista.setViewportView(listaNombresClientes);

        btnCrearCliente.setText("Crear Cliente");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        separador.setForeground(new java.awt.Color(102, 102, 102));

        ttlCrearCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ttlCrearCliente.setText("Crear Cliente");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCI.setText("CI:");

        lblDepartamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDepartamento.setText("Departamento:");

        lblCodigoPostal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigoPostal.setText("Código Postal:");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDireccion.setText("Dirección:");

        txtNombre.setEnabled(false);

        txtCI.setEnabled(false);
        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });

        txtCodigoPostal.setEnabled(false);
        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });

        txtDireccion.setEnabled(false);

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

        comboBoxDepartamentos.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(subttlListaClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radBtnOrdenarPorNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radBtnOrdenarPorMonto))
                    .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ttlCrearCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCI, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDepartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(subttlListaClientes)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radBtnOrdenarPorMonto)
                            .addComponent(radBtnOrdenarPorNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ttlCrearCliente)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblNombre))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblCI))
                            .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartamento)
                            .addComponent(comboBoxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblCodigoPostal))
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblDireccion))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.guardarCliente();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        this.crearCliente();
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.volverAListaClientes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        ValidadorYConversor.inputInt(evt, this.txtCI.getText());
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        ValidadorYConversor.inputInt(evt, this.txtCodigoPostal.getText());
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

    private void radBtnOrdenarPorNombreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radBtnOrdenarPorNombreStateChanged
        cargarListaClientes();
    }//GEN-LAST:event_radBtnOrdenarPorNombreStateChanged
    
    public boolean validarCampos(String campoNombre, String campoCI, String campoCodigoPostal, String campoDireccion){
        //VALIDAR EN OTRA CLASE
        boolean estaOk = false;
        
        //Se verifica que los campos no estén vacíos.
        if(ValidadorYConversor.validarCamposVacios(campoNombre, campoCI, campoCodigoPostal, campoDireccion)){
            estaOk = true;
        }
        return estaOk;
    }
    
    //Funciones principales de botones.
    public void crearCliente(){
        //Desactivar y reactivar botones.
        btnCrearCliente.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        //Activar campos de texto para ingresar cliente.
        txtNombre.setEnabled(true);
        txtCI.setEnabled(true);
        txtCodigoPostal.setEnabled(true);
        comboBoxDepartamentos.setEnabled(true);
        txtDireccion.setEnabled(true);
    }
    
    public void guardarCliente(){
        String campoNombre = txtNombre.getText();
        String campoCI = txtCI.getText();
        String campoCodigoPostal = txtCodigoPostal.getText();
        String campoDepartamento = ValidadorYConversor.obtenerCodigoDepartamento((String) comboBoxDepartamentos.getSelectedItem());
        String campoDireccion = txtDireccion.getText();
        
        //Validamos que los campos no sean vacíos y que los numéricos contengan números.
        if(this.validarCampos(campoNombre, campoCI, campoCodigoPostal, campoDireccion)){

                //Tomamos los datos ingresados en los campos y creamos el cliente.
                String nombre = campoNombre;
                int CI = Integer.parseInt(campoCI);
                int codigoPostal = Integer.parseInt(campoCodigoPostal);
                int departamento = Integer.parseInt(campoDepartamento);
                String direccion = campoDireccion;
                boolean seCreo = miSistema.altaCliente(nombre, direccion, codigoPostal, departamento, CI);
                
                if (seCreo){
                    JOptionPane.showMessageDialog(rootPane, "Se creó el cliente correctamente.", "OPERACIÓN REALIZADA CON ÉXITO", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se pudo crear el cliente.", "CÉDULA INVÁLIDA", JOptionPane.ERROR_MESSAGE);
                }
                //Actualizamos la lista de clientes y volvemos a la fase previa a crear cliente.
                this.volverAListaClientes();
        } else{
            JOptionPane.showMessageDialog(rootPane, "Es posible que hayan campos vacíos", "CAMPOS SIN COMPLETAR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Carga la lista con los nombres de los clientes.
    public void cargarListaClientes(){
        if(radBtnOrdenarPorNombre.isSelected()){
            String[] nuevaLista = miSistema.ordenadarListaPorCriterio( ValidadorYConversor.convertirClientesAPersonas( miSistema.getListaClientes() ), "criterioPorNombre" );
            listaNombresClientes.setListData(nuevaLista);
        } else{
            String[] nuevaLista = miSistema.ordenadarListaPorCriterio( ValidadorYConversor.convertirClientesAPersonas( miSistema.getListaClientes() ), "criterioPorMonto" );
            listaNombresClientes.setListData(nuevaLista);
        }
    }
    
    public void cargarComboBoxDepartamentos(){
        String[] listaDepartamentos = ValidadorYConversor.getListaDepartamentos();
        for (String departamento : listaDepartamentos) {
            comboBoxDepartamentos.addItem(departamento);
        }
    }
    
    public void volverAListaClientes(){
        //Desactivar y reactivar botones.
        btnCrearCliente.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        //Borrar contenido de los campos de texto.
        txtNombre.setText("");
        txtCI.setText("");
        txtCodigoPostal.setText("");
        comboBoxDepartamentos.setSelectedIndex(0);
        txtDireccion.setText("");
        
        //Desactivar campos de texto para ingresar cliente.
        txtNombre.setEnabled(false);
        txtCI.setEnabled(false);
        txtCodigoPostal.setEnabled(false);
        comboBoxDepartamentos.setEnabled(false);
        txtDireccion.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboBoxDepartamentos;
    private javax.swing.JLabel lblCI;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> listaNombresClientes;
    private javax.swing.JRadioButton radBtnOrdenarPorMonto;
    private javax.swing.JRadioButton radBtnOrdenarPorNombre;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel subttlListaClientes;
    private javax.swing.JLabel ttlCrearCliente;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarListaClientes();
    }
}