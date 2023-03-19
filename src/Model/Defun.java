package Model;

import Controller.Main;

import java.util.*;

public class Defun extends AbstractFuncion{
    private String name;
    private List<String> parameters;
    private String body;

    public Defun(){

    }

    /**
     * Definir una funcion
     * @param name nombre de la funcion
     * @param parameters es una lista que se utilizan en la definicion de la funcion
     * @param body cadena de texto que contiene el cuerpo de la funcion
     */
    public Defun(String name, List<String> parameters, String body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    /**
     * @return regresa el nombre de la funcion
     */
    public String getName() {
        return name;
    }

    /**
     * @return regresa la estructura de la funcion
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body recibe la estructura de la funcion
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return regresa una lista
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * @param nombre nombre de la funcion en cadena de texto
     * @param argumentos es una lista que se utilizan en la definicion de la funcion
     * @param cuerpo cadena de texto que contiene el cuerpo de la funcion
     * @throws Exception generar una excepcion de tipo "Exception"
     */
    public void defineFunction(String nombre, ArrayList<String> argumentos, String cuerpo) throws Exception {
        // Extraer el nombre de la función y sus parámetros de la expresión DEFUN
        String functionName = nombre;
        ArrayList<String> parameters = argumentos;
        String body = cuerpo;

        // Crear una instancia de DefunFunction y agregarla a la tabla de símbolos
        Main.symbolTable.put(functionName, new Defun(functionName, parameters, body));
    }

    /**
     * @param line recibe una linea de codigo
     * @return regresa una cadena de texto que indica si la funcion ha sido creada correctamente
     * @throws Exception generar una excepcion de tipo "Exception"
     */
    public String ejecutar(String line) throws Exception {
        line = line.replace("defun ", "");
        line = line.substring(1,line.length()-1);
        String[] cadena = line.split("\\s+\\(");
        String nombre = cadena[0].trim();
        String argumentos = cadena[1].trim().replace(")","");
        String[] argumentosCadena = argumentos.split(" ");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(argumentosCadena));
        String cuerpo = "("+cadena[2];
        defineFunction(nombre,lista,cuerpo);
        return "Funcion creada";
    }

    /**
     * @param def representa la definicion de la funcion a ejecutar
     * @param params lista de cadenas que contiene los valores de los parametros
     * @throws Exception generar una excepcion de tipo "Exception"
     */
    public void ejecutarItself(Defun def, ArrayList<String> params) throws Exception {
        String correctLine = def.body;
        for(int i=0; i<def.parameters.size(); i++){
            correctLine = correctLine.replace(def.parameters.get(i),params.get(i));
        }
        ArrayList<String> s = new ArrayList<>();
        s.add(correctLine);
        Main.interpretar(s);
        System.exit(0);
    }
}