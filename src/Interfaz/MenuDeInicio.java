package Interfaz;
import Lógica.Sistema;
import Lógica.Trabajo;
import Lógica.ValidadorYConversor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class MenuDeInicio extends javax.swing.JFrame {

    Sistema sistema;

    //Contructor
    public MenuDeInicio() {
        try{
            String url = System.getProperty("user.dir");
            FileInputStream file = new FileInputStream(url+"\\data.ser");
            ObjectInputStream datos = new ObjectInputStream(file);

            sistema = (Sistema) datos.readObject();
            sistema.recargaStatics();
            sistema.recargaListeners();

            datos.close();
            file.close();

        }catch (Exception e) {
            sistema = new Sistema();
        }
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Interfaz/iconoLaImprenta.jpg")).getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JMenuBar();
        menuClientesYVendeores = new javax.swing.JMenu();
        subMenuClientes = new javax.swing.JMenu();
        ajustarListaClientes = new javax.swing.JMenuItem();
        verListaClientes = new javax.swing.JMenuItem();
        subMenuVendedores = new javax.swing.JMenu();
        ajustarListaVendedores = new javax.swing.JMenuItem();
        verListaVendedores = new javax.swing.JMenuItem();
        menuTrabajo = new javax.swing.JMenu();
        altaIndividualDeTrabajos = new javax.swing.JMenuItem();
        altaMasivaDeTrabajos = new javax.swing.JMenuItem();
        asignacionDeTrabajos = new javax.swing.JMenuItem();
        consultaDePlanificacion = new javax.swing.JMenuItem();
        desasignacionDeTrabajo = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menú Inicio");
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        menuClientesYVendeores.setText("Clientes/Vendedores");

        subMenuClientes.setText("Clientes");

        ajustarListaClientes.setText("Ajustar Lista Clientes");
        ajustarListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustarListaClientesActionPerformed(evt);
            }
        });
        subMenuClientes.add(ajustarListaClientes);

        verListaClientes.setText("Ver Lista Clientes");
        verListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaClientesActionPerformed(evt);
            }
        });
        subMenuClientes.add(verListaClientes);

        menuClientesYVendeores.add(subMenuClientes);

        subMenuVendedores.setText("Vendedores");

        ajustarListaVendedores.setText("Ajustar Lista Vendedores");
        ajustarListaVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustarListaVendedoresActionPerformed(evt);
            }
        });
        subMenuVendedores.add(ajustarListaVendedores);

        verListaVendedores.setText("Ver Lista Vendedores");
        verListaVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaVendedoresActionPerformed(evt);
            }
        });
        subMenuVendedores.add(verListaVendedores);

        menuClientesYVendeores.add(subMenuVendedores);

        menuPrincipal.add(menuClientesYVendeores);

        menuTrabajo.setText("Trabajo");

        altaIndividualDeTrabajos.setText("Alta Individual de Trabajos");
        altaIndividualDeTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaIndividualDeTrabajosActionPerformed(evt);
            }
        });
        menuTrabajo.add(altaIndividualDeTrabajos);

        altaMasivaDeTrabajos.setText("Alta Masiva de Trabajos");
        altaMasivaDeTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaMasivaDeTrabajosActionPerformed(evt);
            }
        });
        menuTrabajo.add(altaMasivaDeTrabajos);

        asignacionDeTrabajos.setText("Asgnación de Trabajos");
        asignacionDeTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignacionDeTrabajosActionPerformed(evt);
            }
        });
        menuTrabajo.add(asignacionDeTrabajos);

        consultaDePlanificacion.setText("Consulta de Planificación");
        consultaDePlanificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaDePlanificacionActionPerformed(evt);
            }
        });
        menuTrabajo.add(consultaDePlanificacion);

        desasignacionDeTrabajo.setText("Desasignación de Trabajo");
        desasignacionDeTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desasignacionDeTrabajoActionPerformed(evt);
            }
        });
        menuTrabajo.add(desasignacionDeTrabajo);

        menuPrincipal.add(menuTrabajo);

        menuOpciones.setText("Opciones");
        menuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionesActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuOpciones.add(salir);

        menuPrincipal.add(menuOpciones);

        setJMenuBar(menuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void verListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaClientesActionPerformed
        ListaClientes nuevaVentana = new ListaClientes(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_verListaClientesActionPerformed
    private void ajustarListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustarListaClientesActionPerformed
        AgregarCliente nuevaVentana = new AgregarCliente(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_ajustarListaClientesActionPerformed
    private void ajustarListaVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustarListaVendedoresActionPerformed
        AgregarVendedor nuevaVentana = new AgregarVendedor(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_ajustarListaVendedoresActionPerformed
    private void verListaVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaVendedoresActionPerformed
        ListaVendedores nuevaVentana = new ListaVendedores(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_verListaVendedoresActionPerformed
    private void altaIndividualDeTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaIndividualDeTrabajosActionPerformed
        AltaIndividualDeTrabajo1 nuevaVentana = new AltaIndividualDeTrabajo1(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_altaIndividualDeTrabajosActionPerformed
    private void altaMasivaDeTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaMasivaDeTrabajosActionPerformed
        altaMasiva();
    }//GEN-LAST:event_altaMasivaDeTrabajosActionPerformed
    private void asignacionDeTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignacionDeTrabajosActionPerformed
        AsignacionDeTrabajos nuevaVentana = new AsignacionDeTrabajos(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_asignacionDeTrabajosActionPerformed
    private void consultaDePlanificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaDePlanificacionActionPerformed
        ConsultaDePlanificacion nuevaVentana = new ConsultaDePlanificacion(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_consultaDePlanificacionActionPerformed
    private void desasignacionDeTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desasignacionDeTrabajoActionPerformed
        DesasignacionDeTrabajo nuevaVentana = new DesasignacionDeTrabajo(sistema);
        nuevaVentana.setVisible(true);
    }//GEN-LAST:event_desasignacionDeTrabajoActionPerformed

    private void menuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesActionPerformed
        
    }//GEN-LAST:event_menuOpcionesActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea salir?", "CONFIRMAR SOLICITUD", JOptionPane.YES_NO_OPTION);
        if(JOptionPane.OK_OPTION == respuesta){
            sistema.guardarDatos();
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    public void altaMasiva(){
        JFileChooser fileChooser = new JFileChooser();
        int selection = fileChooser.showOpenDialog(this);
        File archivo = fileChooser.getSelectedFile();

        if (selection == 0){

            int primerID = Trabajo.getId();
            int trabajosConAlta = ValidadorYConversor.convertirTxtATrabajos(sistema, archivo);

            if(trabajosConAlta > 0){
                JOptionPane.showMessageDialog(rootPane, "Se dieron de alta los trabajos " + primerID + " al " + (primerID + trabajosConAlta - 1) + ".", "OPERACIÓN REALIZADA CON ÉXITO", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(rootPane, "No se logró ingresar ningún trabajo.", "ERROR CARGA", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ajustarListaClientes;
    private javax.swing.JMenuItem ajustarListaVendedores;
    private javax.swing.JMenuItem altaIndividualDeTrabajos;
    private javax.swing.JMenuItem altaMasivaDeTrabajos;
    private javax.swing.JMenuItem asignacionDeTrabajos;
    private javax.swing.JMenuItem consultaDePlanificacion;
    private javax.swing.JMenuItem desasignacionDeTrabajo;
    private javax.swing.JMenu menuClientesYVendeores;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuTrabajo;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenu subMenuClientes;
    private javax.swing.JMenu subMenuVendedores;
    private javax.swing.JMenuItem verListaClientes;
    private javax.swing.JMenuItem verListaVendedores;
    // End of variables declaration//GEN-END:variables
}