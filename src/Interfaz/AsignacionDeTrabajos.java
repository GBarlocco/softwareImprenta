package Interfaz;
import Lógica.Sistema;
import Lógica.Trabajo;
import Lógica.ValidadorYConversor;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class AsignacionDeTrabajos extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;
    JPanel pnl;
    JButton[][] btn = new JButton[11][9];
    int[] secuencia;

    public AsignacionDeTrabajos(Sistema sistema){
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaTrabajos(this);
        miSistema.aniadirComoListenerDeListaOPs(this);
        secuencia = new int[8];
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        cargarLista();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        lblTrabajosSinAsignar = new javax.swing.JLabel();
        btnConsultarProceso = new javax.swing.JButton();
        btnAsignarTrabajo = new javax.swing.JButton();
        scrollLista = new javax.swing.JScrollPane();
        listaIDTrabajosSinAsignar = new javax.swing.JList<>();
        scrollTabla = new javax.swing.JScrollPane();
        txtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asignación de Trabajos");
        setResizable(false);

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setText("Fecha:");

        lblTrabajosSinAsignar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTrabajosSinAsignar.setText("Trabajos Sin Asignar:");

        btnConsultarProceso.setText("Consultar Planificación");
        btnConsultarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProcesoActionPerformed(evt);
            }
        });

        btnAsignarTrabajo.setText("Asignar Trabajo");
        btnAsignarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTrabajoActionPerformed(evt);
            }
        });

        scrollLista.setPreferredSize(new java.awt.Dimension(258, 310));

        scrollLista.setViewportView(listaIDTrabajosSinAsignar);

        txtFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaFocusLost(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTrabajosSinAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarProceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAsignarTrabajo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrabajosSinAsignar)
                    .addComponent(btnAsignarTrabajo)
                    .addComponent(btnConsultarProceso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollTabla)
                    .addComponent(scrollLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTrabajoActionPerformed
        String fecha = getFecha();
        
        if((!Objects.isNull(listaIDTrabajosSinAsignar.getSelectedValue()) && !Objects.isNull(fecha)) && ValidadorYConversor.validarSecuencia(secuencia)){
            //Obtenemos el id del trabajo seleccionado y lo buscamos como objeto para crear la OP.
            String trabajoSinAsignar = listaIDTrabajosSinAsignar.getSelectedValue().split(" ")[0];
            Trabajo trabajo = miSistema.buscarTrabajo(trabajoSinAsignar);

            miSistema.altaOP(fecha, trabajo, getSecuencia());
        }
    }//GEN-LAST:event_btnAsignarTrabajoActionPerformed

    private void btnConsultarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProcesoActionPerformed
        //Obtenemos la fecha escrita en el bloque de texto.
        String campoFecha = ValidadorYConversor.interpretarFecha(txtFecha.getText());
        if(!Objects.isNull(campoFecha)){
            ConsultaDePlanificacion ventana = new ConsultaDePlanificacion(miSistema, campoFecha);
            ventana.setVisible(true);
        } else if(txtFecha.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "El campo \"fecha\" se encuentra vacío.", "FECHA INVÁLIDA", JOptionPane.WARNING_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(rootPane, "Se debe ingresar una fecha válida para esta función.", "FECHA INVÁLIDA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarProcesoActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        String input = txtFecha.getText();
        ValidadorYConversor.inputTipoFecha(evt, input);
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaFocusLost
        cargarGrilla();
    }//GEN-LAST:event_txtFechaFocusLost

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyPressed
        if(evt.getExtendedKeyCode() == VK_ENTER){
            txtFecha.transferFocusUpCycle();
        }
    }//GEN-LAST:event_txtFechaKeyPressed

    public void cargarLista(){
        String[] nuevaLista = miSistema.trabajosSinAsignar();
        listaIDTrabajosSinAsignar.setListData(nuevaLista);
    }
    
    public void cargarGrilla(){
        String fecha = getFecha();
        secuencia = new int[8];
        
        if(!Objects.isNull(fecha)){
            int[][] horasOcupadas = miSistema.horariosAsignadosPorFecha(fecha);
            pnl = new JPanel();
            pnl.setLayout(new java.awt.GridLayout(11, 9));

            int margenHorarios = 8;
            int margenMaquinas = 1;

            //Creación de tabla.
            for (int j =0; j < btn[0].length; j++){
                PropertyChangeSupport disparador = new PropertyChangeSupport(this);
                for (int i=0; i< btn.length; i++){
                    if(i == 0 || j == 0){
                        //
                        if(i == 0 && j == 0){
                            btn[i][j] = new JButton("");
                            btn[i][j].setEnabled(false);
                            btn[i][j].setBackground(Color.BLACK); // Color está en java.awt.Color
                        } else if(i == 0){
                            btn[i][j] = new JButton("" + margenHorarios);
                            margenHorarios++;
                            btn[i][j].setEnabled(false);
                            btn[i][j].setBackground(Color.BLACK); // Color está en java.awt.Color
                            btn[i][j].setForeground(Color.WHITE);
                        } else{
                            btn[i][j] = new JButton("" + margenMaquinas);
                            btn[i][j].setMargin(new Insets(-5, -5, -5, -5)); // amplía el lugar para el texto
                            margenMaquinas++;
                            btn[i][j].setEnabled(false);
                            btn[i][j].setBackground(Color.BLACK); // Color está en java.awt.Color
                            btn[i][j].setForeground(Color.WHITE);
                        }
                        btn[i][j].setMargin(new Insets(-5, -5, -5, -5)); // amplía el lugar para el texto
                    } else{
                        //Horario ocupado
                        if(horasOcupadas[i][j] > 0){
                            btn[i][j] = new JButton();
                            btn[i][j].setName("");
                            btn[i][j].setEnabled(false);
                            btn[i][j].setBackground(Color.RED); // Color está en java.awt.Color
                            btn[i][j].setForeground(Color.WHITE);
                        } else{
                            btn[i][j] = new JButton();
                            btn[i][j].setName("" + margenHorarios);
                            btn[i][j].setBackground(Color.GREEN); // Color está en java.awt.Color
                            btn[i][j].setForeground(Color.WHITE);
                            btn[i][j].addActionListener(new AsignacionDeTrabajos.TileListener());
                        }
                    }
                }
            }
            for(int i = 0 ; i < btn.length ; i++){
                for(int j = 0 ; j < btn[0].length ; j++){
                    pnl.add(btn[i][j]);
                }
            }
            scrollTabla.setViewportView(pnl);
        }else{
            scrollTabla.setViewportView(null);
        }
    }
    private class TileListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            // este código se ejecutará al hacer click en un botón. Se obtiene cuál botón:
            JButton cual = ((JButton) e.getSource());
            for(int i = 1 ; i < btn.length ; i++){
                for(int j = 1 ; j < btn[0].length ; j++){
                    //Verifica que sean de la misma columna
                    if(btn[i][j].getName().equals(cual.getName())){
                        //Si es el mismo botón.
                        if(btn[i][j].equals(cual)){
                            cual.setBackground(Color.YELLOW);
                            int horario = Integer.parseInt(cual.getName()) - 9;
                            secuencia[horario] = i;
                            //secuencia es un array de 8 posiciones, correspondientes a las horas,
                            //entonces,  en cada hora guardamos la maquina correspondiente(i).
                        } else{
                            btn[i][j].setBackground(Color.GREEN);
                        }
                    }
                }
            }
            // se le puede cambiar características a ese botón, por ejemplo, pintarlo de amarillo:
        }
    }
    
    //Obtenemos la fecha escrita en el bloque de texto o null si no es válida.
    public String getFecha(){
        return ValidadorYConversor.interpretarFecha(txtFecha.getText());
    }
    
    public int[] getSecuencia(){
        return this.secuencia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarTrabajo;
    private javax.swing.JButton btnConsultarProceso;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblTrabajosSinAsignar;
    private javax.swing.JList<String> listaIDTrabajosSinAsignar;
    private javax.swing.JScrollPane scrollLista;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarLista();
        cargarGrilla();
    }
}