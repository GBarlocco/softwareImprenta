package Interfaz;

import Lógica.Sistema;
import Lógica.ValidadorYConversor;
import java.awt.Color;
import java.awt.Insets;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class ConsultaDePlanificacion extends javax.swing.JFrame implements PropertyChangeListener{

    Sistema miSistema;

    public ConsultaDePlanificacion(Sistema sistema){
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaOPs(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
    }
    
    public ConsultaDePlanificacion(Sistema sistema, String fecha){
        miSistema = sistema;
        miSistema.aniadirComoListenerDeListaOPs(this);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        txtFecha.setText(fecha);
        cargarGrillaPorFecha(ValidadorYConversor.interpretarFecha(txtFecha.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        scrollTabla = new javax.swing.JScrollPane();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Planificación");
        setResizable(false);

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFecha.setText("Fecha:");

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarGrillaPorFecha(ValidadorYConversor.interpretarFecha(txtFecha.getText()));
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        String input = txtFecha.getText();
        ValidadorYConversor.inputTipoFecha(evt, input);
    }//GEN-LAST:event_txtFechaKeyTyped

    public void cargarGrillaPorFecha(String fecha){
        String laFecha = ValidadorYConversor.interpretarFecha(fecha);
        int[][] horasOcupadas = miSistema.horariosAsignadosPorFecha(laFecha);
        JPanel pnl;
        JButton[][] btn = new JButton[11][9];
        pnl = new JPanel();
        pnl.setLayout(new java.awt.GridLayout(11, 9));
        
        int margenHorarios = 8;
        int margenMaquinas = 1;
        
        //Creación de tabla.
        for (int j =0; j < btn[0].length; j++){
            for (int i=0; i< btn.length; i++){
                if(i == 0 || j == 0){
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
                } else{
                    //Horario ocupado
                    if(horasOcupadas[i][j] > 0){
                        btn[i][j] = new JButton();
                        btn[i][j].setText("" + horasOcupadas[i][j]);
                        btn[i][j].setBackground(new Color(33*horasOcupadas[i][j]%255, 7*horasOcupadas[i][j]%255, 54*horasOcupadas[i][j]%255)); // Color está en java.awt.Color
                        btn[i][j].setForeground(Color.WHITE);
                    } else{
                        btn[i][j] = new JButton();
                        btn[i][j].setBackground(Color.GREEN); // Color está en java.awt.Color
                        btn[i][j].setForeground(Color.WHITE);
                    }
                }
                btn[i][j].setMargin(new Insets(-5, -5, -5, -5)); // amplía el lugar para el texto
            }
        }
        for(int i = 0 ; i < btn.length ; i++){
            for(int j = 0 ; j < btn[0].length ; j++){
                pnl.add(btn[i][j]);
            }
        }
        scrollTabla.setViewportView(pnl);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarGrillaPorFecha(ValidadorYConversor.interpretarFecha(txtFecha.getText()));
    }
}
