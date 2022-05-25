package Lógica;

import AccesoArchivos.ArchivoGrabacion;
import AccesoArchivos.ArchivoLectura;
import java.util.ArrayList;
import CriteriosDeOrden.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collections;
import java.util.Objects;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class Sistema implements Serializable{
    //Implementa serializable.

    //ATRIBUTOS DE INSTANCIA
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Vendedor> listaVendedores;
    private ArrayList<Trabajo> listaTrabajos;
    private ArrayList<OP> listaOPs;
    transient private PropertyChangeSupport pivoteListaClientes;
    transient private PropertyChangeSupport pivoteListaVendedores;
    transient private PropertyChangeSupport pivoteListaTrabajos;
    transient private PropertyChangeSupport pivoteListaOPs;

    //CONSTRUCTOR
    public Sistema(){
        listaClientes = new ArrayList();
        listaVendedores = new ArrayList();
        listaTrabajos = new ArrayList();
        listaOPs = new ArrayList();
        pivoteListaClientes = new PropertyChangeSupport(this);
        pivoteListaVendedores = new PropertyChangeSupport(this);
        pivoteListaTrabajos = new PropertyChangeSupport(this);
        pivoteListaOPs = new PropertyChangeSupport(this);
    }

    //SETS
    public void setListaClientes(ArrayList<Cliente> unaLista){
        listaClientes = unaLista;
        pivoteListaClientes.firePropertyChange("", true, false);
    }

    public void setListaVendedores(ArrayList<Vendedor> unaLista){
        listaVendedores = unaLista;
        pivoteListaVendedores.firePropertyChange("", true, false);
    }

    public void setListaTrabajos(ArrayList<Trabajo> unaLista){
        listaTrabajos = unaLista;
        pivoteListaTrabajos.firePropertyChange("", true, false);
    }

    public void setListaOPs(ArrayList<OP> unaLista){
        listaOPs = unaLista;
        pivoteListaOPs.firePropertyChange("", true, false);
    }

    public void setPivoteListaClientes(PropertyChangeSupport pivot){
        pivoteListaClientes = pivot;
    }

    public void setPivoteListaVendedores(PropertyChangeSupport pivot){
        pivoteListaVendedores = pivot;
    }

    public void setPivoteListaTrabajos(PropertyChangeSupport pivot){
        pivoteListaTrabajos = pivot;
    }

    public void setPivoteListaOPs(PropertyChangeSupport pivot){
        pivoteListaOPs = pivot;
    }

    //GETS
    public ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }

    public ArrayList<Vendedor> getListaVendedores(){
        return listaVendedores;
    }

    public ArrayList<Trabajo> getListaTrabajos(){
        return listaTrabajos;
    }

    public ArrayList<OP> getListaOPs(){
        return listaOPs;
    }

    public PropertyChangeSupport getPivoteListaClientes(){
        return pivoteListaClientes;
    }

    public PropertyChangeSupport getPivoteListaVendedores(){
        return pivoteListaVendedores;
    }

    public PropertyChangeSupport getPivoteListaTrabajos(){
        return pivoteListaTrabajos;
    }

    public PropertyChangeSupport getPivoteListaOPs(){
        return pivoteListaOPs;
    }

    //MÉTODOS GENERALES.
    //Crea un cliente si este cumple con sus requisitos.
    public boolean altaCliente(String nombre, String direccion, int codigoPostal, int departamento, int cedula){
        boolean esValido = !cedulaExistente(cedula, ValidadorYConversor.convertirClientesAPersonas(listaClientes));
        if (esValido){
            Cliente cliente = new Cliente(nombre, direccion, cedula, codigoPostal, departamento);
            agregarCliente(cliente);
            System.out.println(cliente);
        }
        return esValido;
    }

    //Agrega el nuevo cliente a la lista de clientes.
    public void agregarCliente(Cliente unCliente){
        ArrayList<Cliente> nuevaLista = getListaClientes();
        nuevaLista.add(unCliente);
        setListaClientes(nuevaLista);
    }

    //Crea un vendedor si este cumple con sus requisitos.
    public boolean altaVendedor(String nombre, String direccion, int cedula, int celular, int anioIngreso){
        boolean esValido = !cedulaExistente(cedula, ValidadorYConversor.convertirVendedoresAPersonas(listaVendedores));
        if (esValido){
            Vendedor vendedor = new Vendedor(nombre, direccion, cedula, celular, anioIngreso);
            agregarVendedor(vendedor);
        }
        return esValido;
    }

    //Agrega el nuevo vendedor a la lista de vendedores.
    public void agregarVendedor(Vendedor unVendedor){
        ArrayList<Vendedor> nuevaLista = getListaVendedores();
        nuevaLista.add(unVendedor);
        setListaVendedores(nuevaLista);
    }

    //En base al index seleccionado en una lista de clientes ordenada por nombre. Se devuelve su respectivo cliente.
    public Cliente buscarClientePorNombre(int index){
        ArrayList<Cliente> miLista = getListaClientes();
        Collections.sort(miLista, new CriterioPorNombre());

        return getListaClientes().get(index);
    }

    //A partir de la cédula se retorna su respectivo cliente.
    public Cliente buscarClientePorCI(int cedula){
        ArrayList<Cliente> miLista = getListaClientes();
        Cliente cliente = null;

        for(int i = 0 ; i < miLista.size() && Objects.isNull(cliente) ; i++){
            if(miLista.get(i).getCI() == cedula){
                cliente = miLista.get(i);
            }
        }
        return cliente;
    }

    //En base a un cliente se devuelve su index del ArrayList ordenado por nombre.
    public int buscarIndexDeCliente(Cliente cliente){
        ArrayList<Cliente> miLista = getListaClientes();
        Collections.sort(miLista, new CriterioPorNombre());
        int index = -1;

        for(int i = 0 ; i < miLista.size() && index < 0 ; i++){
            if(miLista.get(i).equals(cliente)){
                index = i;
            }
        }
        return index;
    }

    //En base al index seleccionado en una lista de vendedores ordenada por nombre. Se devuelve su respectivo vendedor.
    public Vendedor buscarVendedorPorNombre(int index){
        ArrayList<Vendedor> miLista = getListaVendedores();
        Collections.sort(miLista, new CriterioPorNombre());
        

        return miLista.get(index);
    }

    //A partir de la cédula se retorna su respectivo vendedor.
    public Vendedor buscarVendedorPorCI(int cedula){
        ArrayList<Vendedor> miLista = getListaVendedores();
        Vendedor vendedor = null;

        for(int i = 0 ; i < miLista.size() && Objects.isNull(vendedor) ; i++){
            if(miLista.get(i).getCI() == cedula){
                vendedor = miLista.get(i);
            }
        }
        return vendedor;
    }

    //En base a un vendedor se devuelve su index del ArrayList ordenado por nombre.
    public int buscarIndexDeVendedor(Vendedor vendedor){
        ArrayList<Vendedor> miLista = getListaVendedores();
        Collections.sort(miLista, new CriterioPorNombre());
        int index = -1;

        for(int i = 0 ; i < miLista.size() && index < 0 ; i++){
            if(miLista.get(i).equals(vendedor)){
                index = i;
            }
        }
        return index;
    }

    //Se busca y retorna un trabajo a partir de su ID ingesado como string.
    public Trabajo buscarTrabajo(String numeroTrabajo){
        ArrayList<Trabajo> listaTrabajo = getListaTrabajos();
        Trabajo unTrabajo = null;

        for(Trabajo t: listaTrabajo){
            if (t.getID_TRABAJO() == Integer.parseInt(numeroTrabajo)){
                unTrabajo = t;
            }
        }
        return unTrabajo;
    }

    //Se busca y retorna un OP a partir de un trabajo.
    public OP buscarOP(Trabajo trabajo){
        ArrayList<OP> listaOP = getListaOPs();
        OP op = null;

        for(int i = 0 ; i < listaOP.size() && Objects.isNull(op) ; i++){
            if(listaOP.get(i).getTRABAJO().equals(trabajo)){
                op = listaOP.get(i);
            }
        }
        return op;
    }

    //Se verifica si alguna persona de la lista a buscar la cédula también tenga el mísmo número.
    public boolean cedulaExistente(int cedula, ArrayList<Persona> lista){
        boolean existe = false;

        for(int i = 0 ; i < lista.size() && !existe ; i++){
            existe = cedula == lista.get(i).getCI();
        }
        return existe;
    }

    //Crea un Trabajo.
    public void altaTrabajo(Cliente cliente, Vendedor vendedor, float costo, String descripcion){
        Trabajo trabajo = new Trabajo(cliente, vendedor, descripcion, costo);
        agregarTrabajo(trabajo);
    }
    //Crea un Trabajo si este cumple con sus requisitos.
    public boolean altaTrabajo(Cliente cliente, Vendedor vendedor, int id, float costo, String descripcion){
        boolean esValido = Trabajo.numeroDeTrabajoValido(id);
        if (esValido){
            Trabajo trabajo = new Trabajo(cliente, vendedor, descripcion, id, costo);
            agregarTrabajo(trabajo);
        }
        return esValido;
    }

    //Agrega el nuevo Trabajo a la lista de trabajos.
    public void agregarTrabajo(Trabajo trabajo){
        ArrayList<Trabajo> nuevaLista = getListaTrabajos();
        trabajo.getCLIENTE().setMontoTotal(trabajo.getCLIENTE().getMontoTotal() + trabajo.getCOSTO());
        nuevaLista.add(trabajo);
        setListaTrabajos(nuevaLista);
    }

    //Crea un OP.
    public void altaOP(String fecha, Trabajo trabajo, int[] secuencia){
        trabajo.setAsignado(true);
        OP op = new OP(fecha, trabajo, secuencia);
        agregarOP(op);
        
        //la secuencia es un array de 8 posiciones correspondiente a las horas,
        // en cada hora se carga una máquina  --> secuencia[i] = maquina.
        // i + 1 = horario.
        for (int i=0; i<secuencia.length; i++){
            int hora = i +8;
            System.out.println("Hora: " + hora + " Máquina:" + secuencia[i] );
        }
    }

    //Agrega el nuevo OP a la lista de OPs.
    public void agregarOP(OP op){
        ArrayList<OP> nuevaLista = getListaOPs();
        nuevaLista.add(op);
        setListaOPs(nuevaLista);
    }

    //Elimina el OP relacionado al trabajo de la lista de OPs y desasigna el trabajo.
    public void desasignarTrabajo(Trabajo trabajo){
        ArrayList<OP> nuevaLista = getListaOPs();

        for(int i = 0 ; i < nuevaLista.size() ; i++){
            if(nuevaLista.get(i).getTRABAJO().equals(trabajo)){
                OP op = nuevaLista.get(i);
                nuevaLista.remove(i);
                trabajo.setAsignado(false);
                setListaOPs(nuevaLista);
                desasignarTxt(trabajo, op);
            }
        }
    }

    //Genera el txt de Desasignados.
    public void desasignarTxt(Trabajo trabajo, OP op){
        String desasignado = "" + trabajo.getID_TRABAJO() + "#" + op.getFECHA();
        if(new File("Desasignados.txt").exists()){

            ArchivoLectura aL = new ArchivoLectura("Desasignados.txt");
            String contenidoDesasignados = "";
            while(aL.hayMasLineas()){
                contenidoDesasignados += aL.linea() + "\n";
            }
            aL.cerrar();
            
            ArchivoGrabacion aG = new ArchivoGrabacion("Desasignados.txt");
            aG.grabarLinea(contenidoDesasignados + desasignado);
            aG.cerrar();
            
            System.out.println(contenidoDesasignados);
        } else{
            ArchivoGrabacion aG = new ArchivoGrabacion("Desasignados.txt");
            aG.grabarLinea(desasignado);
            aG.cerrar();
        }
        System.out.println(desasignado);
    }

    //ORDENAMIENTO.
    //Método general para ordenar personas según un criterio y devolver un array de String con sus nombres.
    public String[] ordenadarListaPorCriterio(ArrayList<Persona> listaDePersonas, String criterio){
        ArrayList<Cliente> listaDeClientes = this.getListaClientes();
        //Evalúa el criterio por el cuál se va a ordenar.
        if (criterio.equalsIgnoreCase("criterioPorNombre")){
            Collections.sort(listaDePersonas, new CriterioPorNombre());
        }else if (criterio.equalsIgnoreCase("criterioPorMonto")){// Se tiene que poder acceder al index del cliente por monto también.
            Collections.sort(listaDePersonas, new CriterioPorMontoTotal());
           // Collections.sort(listaDeClientes, new CriterioPorDepartamento());
        }

        //Generamos un array de String para guardar los nombres de cada cliente.
        String[] listaOrdenada = new String[listaDePersonas.size()];
        for(int i = 0 ; i < listaOrdenada.length ; i++){
            listaOrdenada[i] = listaDePersonas.get(i).getNombre();
        }
        return listaOrdenada;
    }
    

    //Devuelve la lista de trabajos sin asignar como array de String.
    public String[] trabajosSinAsignar(){
        ArrayList<Trabajo> todosLosTrabajos = getListaTrabajos();
        String trabajosSinAsignar = "";

        for(Trabajo t: todosLosTrabajos){
            if(!t.getAsignado()){
                trabajosSinAsignar += t.toString() + "-"; 
            }
        }
        String[] listaOrdenada = trabajosSinAsignar.split("-");
        return listaOrdenada;
    }

    //Devuelve la lista de trabajos asignados como array de String.
    public String[] trabajosAsignados(){
        ArrayList<OP> todosLasOP = getListaOPs();
        String trabajosAsignados = "";

        for(OP op: todosLasOP){
            trabajosAsignados += op.getTRABAJO().toString() + "-";
        }
        String[] lista = trabajosAsignados.split("-");
        return lista;
    }

    //A partir de una fecha, devuelve una matriz de int con los números del id de cada trabajo en la posición respectiva.
    public int[][] horariosAsignadosPorFecha(String fecha){
        ArrayList<OP> todasLasOPs = getListaOPs();
        int[][] grilla = new int[11][9];

        for(OP op: todasLasOPs){
            if(op.getTRABAJO().getAsignado() && op.getFECHA().equals(fecha)){
                //j es el horario del trabajo.
                for(int j = 0 ; j < op.getMAQUINAS().length ; j++){
                    grilla[op.getMAQUINAS()[j]][j + 1] = op.getTRABAJO().getID_TRABAJO(); 
                }
            }
        }
        return grilla;
    }

    //Serializa todo el programa.
    public void guardarDatos() {
        String ruta = System.getProperty("user.dir");

        try {
            FileOutputStream file = new FileOutputStream(ruta+"\\data.ser");
            ObjectOutputStream datos;
            datos = new ObjectOutputStream(file);
            datos.writeObject(this);
            datos.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    //AGREGAR A LISTENER.
    //Cada método sirve para añadirse como listener de X lista según el método.
    public void aniadirComoListenerDeListaClientes(PropertyChangeListener listener){
        pivoteListaClientes.addPropertyChangeListener(listener);
    }
    public void aniadirComoListenerDeListaVendedores(PropertyChangeListener listener){
        pivoteListaVendedores.addPropertyChangeListener(listener);
    }
    public void aniadirComoListenerDeListaTrabajos(PropertyChangeListener listener){
        pivoteListaTrabajos.addPropertyChangeListener(listener);
    }
    public void aniadirComoListenerDeListaOPs(PropertyChangeListener listener){
        pivoteListaOPs.addPropertyChangeListener(listener);
    }

    //NO SERIALIZABLES.
    //Recarga el último id de trabajo ingresado.
    public void recargaStatics(){
        Trabajo.setId(listaTrabajos.get(listaTrabajos.size() - 1).getID_TRABAJO() + 1);
    }
    //Recargar listeners por serialización.
    public void recargaListeners(){
        this.pivoteListaClientes = new PropertyChangeSupport(this);
        this.pivoteListaVendedores = new PropertyChangeSupport(this);
        this.pivoteListaTrabajos = new PropertyChangeSupport(this);
        this.pivoteListaOPs = new PropertyChangeSupport(this);
    }
}