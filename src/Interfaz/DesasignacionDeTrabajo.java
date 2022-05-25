package Interfaz;

import Lógica.Cliente;
import Lógica.OP;
import Lógica.Sistema;
import Lógica.Trabajo;
import Lógica.Vendedor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Objects;
import javax.swing.ImageIcon;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class DesasignacionDeTrabajo extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;

    public DesasignacionDeTrabajo(Sistema sistema) {
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaOPs(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        cargarLista();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subttlTrabajosAsignados = new javax.swing.JLabel();
        scrollLista = new javax.swing.JScrollPane();
        listaIDTrabajosAsignados = new javax.swing.JList<>();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblHorasAsignadas = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        scrollTxtArea = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        txtNombreCliente = new javax.swing.JTextField();
        txtCICliente = new javax.swing.JTextField();
        txtDepartamentoCliente = new javax.swing.JTextField();
        txtCodigoPostalCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtNombreVendedor = new javax.swing.JTextField();
        txtCIVendedor = new javax.swing.JTextField();
        txtCelularVendedor = new javax.swing.JTextField();
        txtDireccionVendedor = new javax.swing.JTextField();
        txtAnioDeIngresoVendedor = new javax.swing.JTextField();
        lblNombreCliente = new javax.swing.JLabel();
        lblCICliente = new javax.swing.JLabel();
        lblDepartamentoCliente = new javax.swing.JLabel();
        lblCodigoPostalCliente = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        lblNombreVendedor = new javax.swing.JLabel();
        lblCIVendedor = new javax.swing.JLabel();
        lblCelularVendedor = new javax.swing.JLabel();
        lblDireccionVendedor = new javax.swing.JLabel();
        lblAnioDeIngresoVendedor = new javax.swing.JLabel();
        txtHorasAsignadas = new javax.swing.JTextField();
        btnDesasignarTrabajo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Desasignación de Trabajos");
        setResizable(false);

        subttlTrabajosAsignados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subttlTrabajosAsignados.setText("Trabajos Asignados:");

        listaIDTrabajosAsignados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaIDTrabajosAsignadosValueChanged(evt);
            }
        });
        scrollLista.setViewportView(listaIDTrabajosAsignados);

        lblFecha.setText("Fecha:");

        txtFecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFecha.setEnabled(false);

        lblHorasAsignadas.setText("Horas Asignadas:");

        lblCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCliente.setText("Cliente Asignado:");

        lblVendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVendedor.setText("Vendedor:");

        lblCosto.setText("Costo:");

        lblDescripcion.setText("Descripción:");

        txtCosto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCosto.setEnabled(false);

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAreaDescripcion.setEnabled(false);
        scrollTxtArea.setViewportView(txtAreaDescripcion);

        txtNombreCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setEnabled(false);

        txtCICliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCICliente.setEnabled(false);

        txtDepartamentoCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDepartamentoCliente.setEnabled(false);

        txtCodigoPostalCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoPostalCliente.setEnabled(false);

        txtDireccionCliente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDireccionCliente.setEnabled(false);

        txtNombreVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreVendedor.setEnabled(false);

        txtCIVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCIVendedor.setEnabled(false);

        txtCelularVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCelularVendedor.setEnabled(false);

        txtDireccionVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDireccionVendedor.setEnabled(false);

        txtAnioDeIngresoVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAnioDeIngresoVendedor.setEnabled(false);

        lblNombreCliente.setText("Nombre:");

        lblCICliente.setText("CI:");

        lblDepartamentoCliente.setText("Departamento:");

        lblCodigoPostalCliente.setText("Código Postal:");

        lblDireccionCliente.setText("Dirección:");

        lblNombreVendedor.setText("Nombre:");

        lblCIVendedor.setText("CI:");

        lblCelularVendedor.setText("Celular:");

        lblDireccionVendedor.setText("Dirección:");

        lblAnioDeIngresoVendedor.setText("Año de Ingreso:");

        txtHorasAsignadas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHorasAsignadas.setEnabled(false);

        btnDesasignarTrabajo.setText("Desasignar Trabajo");
        btnDesasignarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesasignarTrabajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subttlTrabajosAsignados)
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHorasAsignadas)
                            .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollTxtArea)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHorasAsignadas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btnDesasignarTrabajo)))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCICliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDepartamentoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(lblCodigoPostalCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCICliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepartamentoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoPostalCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCIVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCelularVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccionVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnioDeIngresoVendedor))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCIVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelularVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnioDeIngresoVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblCliente)
                        .addGap(238, 238, 238)
                        .addComponent(lblVendedor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblFecha)
                        .addGap(13, 13, 13)
                        .addComponent(lblHorasAsignadas)
                        .addGap(16, 16, 16)
                        .addComponent(lblCosto)
                        .addGap(13, 13, 13)
                        .addComponent(lblDescripcion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDesasignarTrabajo))
                        .addGap(5, 5, 5)
                        .addComponent(txtHorasAsignadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(scrollTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(subttlTrabajosAsignados)
                        .addGap(6, 6, 6)
                        .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblVendedor)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreCliente)
                            .addComponent(lblNombreVendedor))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCIVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCICliente)
                            .addComponent(lblCIVendedor))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepartamentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelularVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartamentoCliente)
                            .addComponent(lblCelularVendedor))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoPostalCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoPostalCliente)
                            .addComponent(lblDireccionVendedor))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnioDeIngresoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccionCliente)
                            .addComponent(lblAnioDeIngresoVendedor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaIDTrabajosAsignadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaIDTrabajosAsignadosValueChanged
        String idTrabajo = this.listaIDTrabajosAsignados.getSelectedValue();
        borrarInfo();
        if(!Objects.isNull(idTrabajo)){
            idTrabajo = idTrabajo.split(" ")[0];
            if(!idTrabajo.equals("")){
                cargarDatos();
            }
        }
    }//GEN-LAST:event_listaIDTrabajosAsignadosValueChanged

    private void btnDesasignarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesasignarTrabajoActionPerformed
        desasignar();
    }//GEN-LAST:event_btnDesasignarTrabajoActionPerformed

    //Carga la lista de OPs.
    public void cargarLista(){
        String[] datos = miSistema.trabajosAsignados();
        listaIDTrabajosAsignados.setListData(datos); 
    }
    
    public void desasignar(){
        String idTrabajo = this.listaIDTrabajosAsignados.getSelectedValue();
        if(!Objects.isNull(idTrabajo)){

            idTrabajo = idTrabajo.split(" ")[0];
            if(!idTrabajo.equals("")){
                Trabajo trabajo = miSistema.buscarTrabajo(idTrabajo);
                miSistema.desasignarTrabajo(trabajo);
            }
        }
    }

    //CARGA DE DATOS

    //Carga los datos del cliente seleccionado en los campos de texto de la ventana.
    public void cargarDatos(){

        String idTrabajo = this.listaIDTrabajosAsignados.getSelectedValue();
        idTrabajo = idTrabajo.split(" ")[0];
        
        Trabajo trabajo = miSistema.buscarTrabajo(idTrabajo);
        OP op = miSistema.buscarOP(trabajo);
        
        Cliente cliente = trabajo.getCLIENTE();
        Vendedor vendedor = trabajo.getVENDEDOR();
        

        cargarDatosDeLaOP(op);
        cargarDatosDelTrabajo(trabajo);
        cargarDatosDelCliente(cliente);
        cargarDatosDelVendedor(vendedor);
    }

    //Carga los datos de la Orden de Producción seleccionada.
    public void cargarDatosDeLaOP(OP op){
        this.txtFecha.setText("" + op.getFECHA());
        this.txtHorasAsignadas.setText("" + op.cantidadDeHoras());
    }

    //Carga los datos del trabajo indicado.
    public void cargarDatosDelTrabajo(Trabajo trabajo){
        this.txtCosto.setText("" + trabajo.getCOSTO());
        this.txtAreaDescripcion.setText(trabajo.getDESCRIPCION());
    }

    //Carga los datos del cliente relacionado al trabajo.
    public void cargarDatosDelCliente(Cliente cliente){
        this.txtNombreCliente.setText(cliente.getNombre());
        this.txtCICliente.setText("" + cliente.getCI());
        this.txtDepartamentoCliente.setText("" + cliente.getDepartamento());
        this.txtCodigoPostalCliente.setText("" + cliente.getCodigoPostal());
        this.txtDireccionCliente.setText(cliente.getDireccion());
    }

    //Carga los datos del vendedor relacionado al trabajo.
    public void cargarDatosDelVendedor(Vendedor vendedor){
        this.txtNombreVendedor.setText(vendedor.getNombre());
        this.txtCIVendedor.setText("" + vendedor.getCI());
        this.txtCelularVendedor.setText("" + vendedor.getCelular());
        this.txtDireccionVendedor.setText(vendedor.getDireccion());
        this.txtAnioDeIngresoVendedor.setText("" + vendedor.getANIO_INGRESO());
    }

    public void borrarInfo(){
        this.txtFecha.setText("");
        this.txtHorasAsignadas.setText("");
        this.txtCosto.setText("");
        this.txtAreaDescripcion.setText("");
        this.txtNombreCliente.setText("");
        this.txtCICliente.setText("");
        this.txtDepartamentoCliente.setText("");
        this.txtCodigoPostalCliente.setText("");
        this.txtDireccionCliente.setText("");
        this.txtNombreVendedor.setText("");
        this.txtCIVendedor.setText("");
        this.txtCelularVendedor.setText("");
        this.txtDireccionVendedor.setText("");
        this.txtAnioDeIngresoVendedor.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDesasignarTrabajo;
    private javax.swing.JLabel lblAnioDeIngresoVendedor;
    private javax.swing.JLabel lblCICliente;
    private javax.swing.JLabel lblCIVendedor;
    private javax.swing.JLabel lblCelularVendedor;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigoPostalCliente;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDepartamentoCliente;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblDireccionVendedor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorasAsignadas;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreVendedor;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JList<String> listaIDTrabajosAsignados;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JScrollPane scrollTxtArea;
    private javax.swing.JLabel subttlTrabajosAsignados;
    private javax.swing.JTextField txtAnioDeIngresoVendedor;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtCICliente;
    private javax.swing.JTextField txtCIVendedor;
    private javax.swing.JTextField txtCelularVendedor;
    private javax.swing.JTextField txtCodigoPostalCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDepartamentoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionVendedor;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHorasAsignadas;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreVendedor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarLista();
    }
}