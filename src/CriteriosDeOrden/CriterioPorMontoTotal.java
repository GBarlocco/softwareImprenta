package CriteriosDeOrden;

import Lógica.Cliente;
import Lógica.Persona;
import java.util.Comparator;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */
public class CriterioPorMontoTotal implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
       /* int retorno = 0;

        if((p1.getMontoTotal() - p2.getMontoTotal()) > 0){
            retorno = -1;
        } else if((p1.getMontoTotal() - p2.getMontoTotal()) < 0){
            retorno = 1;
        }

        return retorno;
        */
       return (int)(p1.getMontoTotal() - p2.getMontoTotal()); // --> de menor a mayor.
       //return (int)(p2.getMontoTotal() - p1.getMontoTotal()); // --> de mayor a menor.
    }

}