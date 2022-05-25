package Lógica;

import java.io.Serializable;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */

// OP = Orden de Producción.
public class OP implements Serializable{
    // Implementa serializable.

    //ATRIBUTOS DE INSTANCIA
    final private String FECHA;
    final private Trabajo TRABAJO;
    final private int[] MAQUINAS;
    
    // final no se pueden modificar.

    //CONSTRUCTOR
    public OP(String unaFecha, Trabajo unTrabajo, int[] secuenciaMaquinas){
        FECHA = unaFecha;
        TRABAJO = unTrabajo;
        MAQUINAS = secuenciaMaquinas;
    }

    //GETS
    public String getFECHA(){
        return this.FECHA;
    }

    public Trabajo getTRABAJO(){
        return this.TRABAJO;
    }

    public int[] getMAQUINAS(){
        return this.MAQUINAS;
    }

    //MÉTODOS GENERALES
    //Calcula y retorna la cantidad de horas asignadas al trabajo.
    public int cantidadDeHoras(){
        int horas = 0;

        for(int i = 0 ; i < this.MAQUINAS.length ; i++){
            if(this.MAQUINAS[i] > 0 ){
                horas++;
            }
        }

        return horas;
    }
}