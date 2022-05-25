package Lógica;

import AccesoArchivos.ArchivoLectura;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
/**
 *
 * @author "Santiago Palacios - 248074 _ Gastón Barlocco - 241025"
 */ 
public abstract class ValidadorYConversor { //PROBAR HACER ABSTRACT

    //ATRIBUTO DE CLASE
    //DEPARTAMENTOS
    private static HashMap<String, String> listaDepartamentos = new HashMap<String, String>(){{put("1","Artigas"); put("2","Canelones"); put("3","Cerro Largo"); put("4","Colonia");
                                                                                               put("5","Durazno"); put("6","Flores"); put("7","Florida"); put("8","Lavalleja");
                                                                                               put("9","Maldonado"); put("10","Montevideo"); put("11","Paysandú"); put("12","Rio Negro");
                                                                                               put("13","Rivera"); put("14","Rocha"); put("15","Salto"); put("16","San Jose");
                                                                                               put("17","Soriano"); put("18","Tacuarembó"); put("19","Treinta Y Tres");}};

    //GET
    //Devuelve un array de Strings con los nombres de los departamentos para cargarlos en el comboBox de AgregarCliente.
    public static String[] getListaDepartamentos(){
        String[] departamentos = new String[listaDepartamentos.size()];
        Iterator<String> it = listaDepartamentos.keySet().iterator();
        int pos = 0;

        while(it.hasNext()){
            departamentos[pos] = listaDepartamentos.get(it.next());
            pos++;
        }

        //Los ordenamos para que se muestren por orden alfabético.
        Arrays.sort(departamentos);

        return departamentos;
    }

    //Para almacenar el dato en Cliente, transorfmamos el nombre seleccionado en el comboBox de AgregarCliente a su código de departamento.
    public static String obtenerCodigoDepartamento(String departamento){
        String retorno = "";

        for(int i = 1 ; i < listaDepartamentos.size() + 1 && retorno.equals("") ; i++){
            if(departamento.equals(listaDepartamentos.get("" + i))){
                retorno += i;
            }
        }

        return retorno;
    }

    //VALIDADORES
    //Para verificar si un año ingresado en una fecha, no es menor que 2021
    public static boolean anioValido(Date fecha){
        String[] laFecha = fecha.toString().split(" ");
        int anio = Integer.parseInt(laFecha[laFecha.length - 1]);
        return anio > 2020;
    }

    //CONVERSORES
    //Convierte ArrayList de Clientes a ArrayList de Personas, para trabajar ciertos métodos por igual.
    public static ArrayList<Persona> convertirClientesAPersonas(ArrayList<Cliente> listaClientes){
        ArrayList<Persona> listaPersonas = new ArrayList();

        //Parsea Cliente por Cliente y los añade al ArrayList de Personas.
        for(Cliente c: listaClientes){
            listaPersonas.add((Persona) c);
        }

        return listaPersonas;
    }

    //Convierte ArrayList de Vendedores a ArrayList de Personas, para trabajar ciertos métodos por igual.
    public static ArrayList<Persona> convertirVendedoresAPersonas(ArrayList<Vendedor> listaVendedores){
        ArrayList<Persona> listaPersonas = new ArrayList();

        //Parsea Vendedor por Vendedor y los añade al ArrayList de Personas.
        for(Vendedor v: listaVendedores){
            listaPersonas.add((Persona) v);
        }

        return listaPersonas;
    }

    //Interpreta un txt como Trabajos y los da de alta.
    public static int convertirTxtATrabajos(Sistema sistema, File archivo){
        ArchivoLectura aL = new ArchivoLectura(archivo.getAbsolutePath());
        int trabajosConAlta = 0;

        //Por cada línea disponible, se interpretan los datos y se crea el trabajo con los datos de la línea.
        while(aL.hayMasLineas()){
            String[] linea = aL.linea().split("#");

            int ciCliente = Integer.parseInt(linea[0]);
            int ciVendedor = Integer.parseInt(linea[1]);

            Cliente cliente = sistema.buscarClientePorCI(ciCliente);
            Vendedor vendedor = sistema.buscarVendedorPorCI(ciVendedor);
            String descripcion = linea[2];
            Float costo = Float.parseFloat(linea[3]);

            if(!Objects.isNull(cliente) && !Objects.isNull(vendedor)){
                sistema.altaTrabajo(cliente, vendedor, costo, descripcion);
                trabajosConAlta++;
            }
        }

        aL.cerrar();
        //Devuelve la cantidad de trabajos dados de alta, para mostrar cuáles se ingresaron.
        return trabajosConAlta;
    }

    //Interpreta un String como Date. Al Date se lo parsea con el formato deseado, si no es posible, el String devuelve null.
    public static String interpretarFecha (String unaFecha){
        String laFecha = null;
        Date fecha = null;

        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            fecha = formato.parse(unaFecha);

            if(anioValido(fecha)){
                laFecha = formato.format(fecha);
            }

        }catch(ParseException e){}

        return laFecha;
    }

    //INPUTS DE INTERFAZ
    //Verifica que el input sea de hasta nueve dígitos y sea un número positivo.
    public static void inputInt(KeyEvent evt, String input){
        if(input.length() < 9){
            char digito = evt.getKeyChar();
            if('0' > digito || digito > '9'){
                evt.consume();
            }
        } else{
            evt.consume();
        }
    }

    //Verifica que el input sea un número positivo e incluya los decimales.
    public static void inputFloat(KeyEvent evt){
        char digito = evt.getKeyChar();
        if(('0' > digito || digito > '9') && digito != '.'){
            evt.consume();
        }
    }

    //Verifica que el input sea de hasta 10 dígitos, sean números positivos e incluya la barra diagonal.
    public static void inputTipoFecha(KeyEvent evt, String input){
        char digito = evt.getKeyChar();
        if(input.length() >= 10){
            evt.consume();
        } else if(('0' > digito || digito > '9') && digito != '/'){
            evt.consume();
        }
    }

    //Verifica que la secuencia ingresada no sea nula.
    public static boolean validarSecuencia(int[] secuencia){
        boolean valida = false;
        for(int i = 0 ; i < secuencia.length && !valida ; i++){
            valida = secuencia[i] > 0;
        }
        return valida;
    }

    //Verifica que el campo no esté vacío.
    public static boolean campoVacio(String txt){
        return txt.isEmpty();
    }

    //Valida que ninguno de los 2 campos ingesados esté vacío.
    public static boolean validarCamposVacios(String campo1, String campo2){
        boolean estaOk = false;

        //Se verifica que los campos no estén vacíos.
        if(!ValidadorYConversor.campoVacio(campo1) && !ValidadorYConversor.campoVacio(campo2)){

            estaOk = true;
        }

        return estaOk;
    }
    //Valida que ninguno de los 4 campos ingesados esté vacío.
    public static boolean validarCamposVacios(String campo1, String campo2, String campo3, String campo4){
        boolean estaOk = false;

        //Se verifica que los campos no estén vacíos.
        if(!ValidadorYConversor.campoVacio(campo1) && !ValidadorYConversor.campoVacio(campo2) && 
           !ValidadorYConversor.campoVacio(campo3) && !ValidadorYConversor.campoVacio(campo4)){

            estaOk = true;
        }

        return estaOk;
    }
    //Valida que ninguno de los 5 campos ingesados esté vacío.
    public static boolean validarCamposVacios(String campo1, String campo2, String campo3, String campo4, String campo5){
        boolean estaOk = false;

        //Se verifica que los campos no estén vacíos.
        if(!ValidadorYConversor.campoVacio(campo1) && !ValidadorYConversor.campoVacio(campo2) && 
           !ValidadorYConversor.campoVacio(campo3) && !ValidadorYConversor.campoVacio(campo4) &&
           !ValidadorYConversor.campoVacio(campo5)){

            estaOk = true;
        }

        return estaOk;
    }
}