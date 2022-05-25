package Lógica;

import java.io.Serializable;

/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class Vendedor extends Persona implements Serializable{

    //ATRIBUTOS DE INSTANCIA
    private int celular;
    final private int ANIO_INGRESO;

    //CONSTRUCTOR
    public Vendedor(String nombre, String direccion, int ci, int unCelular, int unAnio){
        super(nombre, direccion, ci);
        celular = unCelular;
        ANIO_INGRESO = unAnio;
    }

    //SET
    public void setCelular(int unCelular){
        this.celular = unCelular;
    }

    //GETS
    public int getCelular(){
        return this.celular;
    }

    public int getANIO_INGRESO(){
        return this.ANIO_INGRESO;
    }
}