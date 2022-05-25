package Interfaz;
import Lógica.Cliente;
import Lógica.Persona;
import Lógica.Sistema;
import Lógica.ValidadorYConversor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ImageIcon;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class ListaClientes extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;
    public ListaClientes(Sistema sistema) {
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaClientes(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        cargarListaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollLista = new javax.swing.JScrollPane();
        listaNombresClientes = new javax.swing.JList<>();
        ttlInfoCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCI = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblCodigoPostal = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Clientes");
        setResizable(false);

        listaNombresClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaNombresClientesValueChanged(evt);
            }
        });
        scrollLista.setViewportView(listaNombresClientes);

        ttlInfoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttlInfoCliente.setText("Info Cliente");

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

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);

        txtCI.setEditable(false);
        txtCI.setBackground(new java.awt.Color(255, 255, 255));
        txtCI.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCI.setEnabled(false);

        txtDepartamento.setEditable(false);
        txtDepartamento.setBackground(new java.awt.Color(255, 255, 255));
        txtDepartamento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDepartamento.setEnabled(false);

        txtCodigoPostal.setEditable(false);
        txtCodigoPostal.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoPostal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigoPostal.setEnabled(false);

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDireccion.setEnabled(false);

        btnAyuda.setText("Ayuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ttlInfoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDepartamento)
                        .addGap(7, 7, 7)
                        .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(scrollLista, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ttlInfoCliente)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCI)
                            .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartamento)
                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoPostal)
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btnAyuda)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Carga la lista de clientes.
    private void listaNombresClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaNombresClientesValueChanged
        this.cargarDatosDelCliente();
    }//GEN-LAST:event_listaNombresClientesValueChanged

    //Carga la lista con los nombres de los clientes.
    public void cargarListaClientes(){
        String[] nuevaLista = miSistema.ordenadarListaPorCriterio(ValidadorYConversor.convertirClientesAPersonas( miSistema.getListaClientes()), "criterioPorNombre" );
        this.listaNombresClientes.setListData(nuevaLista);
    }

    //Carga los datos del cliente seleccionado en los campos de texto de la ventana.
    public void cargarDatosDelCliente(){
        int posicion = this.listaNombresClientes.getSelectedIndex();
        Cliente cliente = miSistema.buscarClientePorNombre(posicion);
        this.txtNombre.setText(cliente.getNombre());
        this.txtCI.setText("" + cliente.getCI());
        this.txtDepartamento.setText("" + cliente.getDepartamento());
        this.txtCodigoPostal.setText("" + cliente.getCodigoPostal());
        this.txtDireccion.setText(cliente.getDireccion());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JLabel lblCI;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> listaNombresClientes;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JLabel ttlInfoCliente;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarListaClientes();
    }
}