
package CriteriosDeOrden;

import Lógica.Cliente;
import Lógica.Persona;
import java.util.Comparator;

public class CriterioPorDepartamento implements Comparator<Cliente>{
    @Override
    public int compare(Cliente c1, Cliente c2) {

        return (c2.getDepartamento() - c1.getDepartamento()); // --> de mayor a menor.
        // return (c1.getDepartamento() - c2.getDepartamento()); --> de menor a mayor
    }
}
/*
    <0  cuando el primero va antes que el segundo.
    >0  cuando el primero va después que el segundo.
    =0 cuando son iguales.
*/

/*

package CriteriosDeOrden;

import Lógica.Cliente;
import Lógica.Persona;
import java.util.Comparator;

public class CriterioPorMontoTotal implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        int retorno = 0;

        if((p1.getMontoTotal() - p2.getMontoTotal()) > 0){
            retorno = -1;
        } else if((p1.getMontoTotal() - p2.getMontoTotal()) < 0){
            retorno = 1;
        }

        return retorno;
    }

}

*/