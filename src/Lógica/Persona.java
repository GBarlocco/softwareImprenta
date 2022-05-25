package Lógica;

import java.io.Serializable;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public abstract class Persona implements Serializable{
    //Implementa serializable

    //ATRIBUTOS DE INSTANCIA
    private String nombre;
    private String direccion;
    final private int CI;
    private float montoTotal;

    //CONSTRUCTOR
    public Persona(String unNombre, String unaDireccion, int ci){
        nombre = unNombre;
        direccion = unaDireccion;
        CI = ci;
        montoTotal = 0;
    }

    //SETS
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }

    public void setDireccion(String unaDireccion){
        this.direccion = unaDireccion;
    }

    public void setMontoTotal(float unMonto){
        this.montoTotal = unMonto;
    }

    //GETS
    public String getNombre(){
        return this.nombre;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public int getCI(){
        return this.CI;
    }

    public float getMontoTotal(){
        return this.montoTotal;
    }
}