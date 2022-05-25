package Lógica;

import java.io.Serializable;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class Trabajo implements Serializable{

    //ATRIBUTO DE CLASE
    private static int Id = 1;

    //ATRIBUTOS DE INSTANCIA
    final private Cliente CLIENTE;
    final private Vendedor VENDEDOR;
    final private String DESCRIPCION;
    final private float COSTO;
    final private int ID_TRABAJO;
    private boolean asignado;

    //CONSTRUCTORES
    //Constructor sin id como parámetro.
    public Trabajo(Cliente unCliente, Vendedor unVendedor, String unaDescripcion, float unCosto){
        CLIENTE = unCliente;
        VENDEDOR = unVendedor;
        DESCRIPCION = unaDescripcion;
        COSTO = unCosto;
        ID_TRABAJO = getId();
        setId(getId() + 1);
        asignado = false;
    }

    //Constructor con todas los atributos de instancia como parámetro.
    public Trabajo(Cliente unCliente, Vendedor unVendedor, String unaDescripcion, int unIdTrabajo, float unCosto){
        CLIENTE = unCliente;
        VENDEDOR = unVendedor;
        DESCRIPCION = unaDescripcion;
        COSTO = unCosto;
        ID_TRABAJO = unIdTrabajo;
        setId(unIdTrabajo + 1);
        asignado = false;
    }

    //SETS
    public static void setId(int unId){
        Id = unId;
    }

    public void setAsignado(boolean asignacion){
        this.asignado = asignacion;
    }

    //GETS
    public static int getId(){
        return Id;
    }

    public Cliente getCLIENTE(){
        return this.CLIENTE;
    }

    public Vendedor getVENDEDOR(){
        return this.VENDEDOR;
    }

    public String getDESCRIPCION(){
        return this.DESCRIPCION;
    }

    public float getCOSTO(){
        return this.COSTO;
    }

    public int getID_TRABAJO(){
        return this.ID_TRABAJO;
    }

    public boolean getAsignado(){
        return this.asignado;
    }

    //MÉTODOS GENERALES
    //Valida si un id ingresado manualmente es mayor que el último o no.
    public static boolean numeroDeTrabajoValido(int id){
        return getId() <= id ;
    }

    //Definición del toString.
    @Override
    public String toString(){
        return "" + this.getID_TRABAJO() + " " + this.getCLIENTE().getNombre();
    }
}