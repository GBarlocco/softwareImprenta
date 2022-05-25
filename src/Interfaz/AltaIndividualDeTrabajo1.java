package Interfaz;

import Lógica.Cliente;
import Lógica.Sistema;
import Lógica.ValidadorYConversor;
import Lógica.Vendedor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class AltaIndividualDeTrabajo1 extends javax.swing.JFrame {

    Sistema miSistema;

    public AltaIndividualDeTrabajo1(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        cargarListaClientes();
        cargarListaVendedores();
    }

    public AltaIndividualDeTrabajo1(Sistema sistema, Cliente cliente, Vendedor vendedor){
        miSistema = sistema;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        cargarListaClientes();
        cargarListaVendedores();
        listaNombresClientes.setSelectedIndex(miSistema.buscarIndexDeCliente(cliente));
        listaNombresVendedores.setSelectedIndex(miSistema.buscarIndexDeVendedor(vendedor));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subttlListaDeClientes = new javax.swing.JLabel();
        scrollListaClientes = new javax.swing.JScrollPane();
        listaNombresClientes = new javax.swing.JList<>();
        subttlListaDeVendedores = new javax.swing.JLabel();
        scrollListaVendedores = new javax.swing.JScrollPane();
        listaNombresVendedores = new javax.swing.JList<>();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta Individual de Trabajo");
        setResizable(false);

        subttlListaDeClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subttlListaDeClientes.setText("Lista de Clientes");

        scrollListaClientes.setViewportView(listaNombresClientes);

        subttlListaDeVendedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subttlListaDeVendedores.setText("Lista de Vendedores");

        scrollListaVendedores.setViewportView(listaNombresVendedores);

        btnSiguiente.setText("Siguiente ->");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scrollListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subttlListaDeClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollListaVendedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(subttlListaDeVendedores)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subttlListaDeClientes)
                    .addComponent(subttlListaDeVendedores))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollListaVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(scrollListaClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(listaNombresClientes.isSelectionEmpty() || listaNombresVendedores.isSelectionEmpty()){
            if(listaNombresClientes.isSelectionEmpty() && listaNombresVendedores.isSelectionEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Faltan selecionar cliente y vendedor.", "CAMPOS SIN COMPLETAR", JOptionPane.WARNING_MESSAGE);
            } else{
                if(listaNombresClientes.isSelectionEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Falta selecionar un cliente.", "CAMPOS SIN COMPLETAR", JOptionPane.WARNING_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Falta selecionar un vendedor.", "CAMPOS SIN COMPLETAR", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else{
            Cliente clienteSeleccionado = miSistema.buscarClientePorNombre(listaNombresClientes.getSelectedIndex());
            Vendedor vendedorSeleccionado = miSistema.buscarVendedorPorNombre(listaNombresVendedores.getSelectedIndex());
            AltaIndividualDeTrabajo2 nuevaVentana = new AltaIndividualDeTrabajo2(miSistema, clienteSeleccionado, vendedorSeleccionado);
            nuevaVentana.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    //Carga la lista con los nombres de los clientes.
    public void cargarListaClientes(){
        String[] nuevaLista = miSistema.ordenadarListaPorCriterio(ValidadorYConversor.convertirClientesAPersonas( miSistema.getListaClientes()), "criterioPorNombre");
        listaNombresClientes.setListData(nuevaLista);
    }

    //Carga la lista con los nombres de los vendedores.
    public void cargarListaVendedores(){
        String[] nuevaLista = miSistema.ordenadarListaPorCriterio(ValidadorYConversor.convertirVendedoresAPersonas( miSistema.getListaVendedores()), "criterioPorNombre");
        listaNombresVendedores.setListData(nuevaLista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JList<String> listaNombresClientes;
    private javax.swing.JList<String> listaNombresVendedores;
    private javax.swing.JScrollPane scrollListaClientes;
    private javax.swing.JScrollPane scrollListaVendedores;
    private javax.swing.JLabel subttlListaDeClientes;
    private javax.swing.JLabel subttlListaDeVendedores;
    // End of variables declaration//GEN-END:variables
}
