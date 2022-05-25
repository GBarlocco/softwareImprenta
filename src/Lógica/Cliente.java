package Lógica;

import java.io.Serializable;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class Cliente extends Persona implements Serializable{

    //ATRIBUTOS DE INSTANCIA
    private int codigoPostal;
    private int departamento;

    //CONSTRUCTOR
    public Cliente(String nombre, String direccion, int ci, int unCodigoPostal, int unDepartamento){
        super(nombre, direccion, ci); //hereda de la clase persona el nombre, la direccion y CI.
        codigoPostal = unCodigoPostal;
        departamento = unDepartamento;
    }

    //SETS
    public void setCodigoPostal(int unCodigoPostal){
        this.codigoPostal = unCodigoPostal;
    }

    public void setDepartamento(int unDepartamento){
        this.departamento = unDepartamento;
    }

    //GETS
    public int getCodigoPostal(){
        return this.codigoPostal;
    }

    public int getDepartamento(){
        return this.departamento;
    }

}