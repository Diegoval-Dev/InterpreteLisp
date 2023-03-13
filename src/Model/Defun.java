package Model;

import Controller.Main;

import java.util.*;

public class Defun extends AbstractFuncion{
    private String name;
    private List<String> parameters;
    private String body;
    public Defun(){

    }
    public Defun(String name, List<String> parameters, String body) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void defineFunction(String nombre, ArrayList<String> argumentos, String cuerpo) throws Exception {
        // Extraer el nombre de la función y sus parámetros de la expresión DEFUN
        String functionName = nombre;
        ArrayList<String> parameters = argumentos;
        String body = cuerpo;

        // Crear una instancia de DefunFunction y agregarla a la tabla de símbolos
        Main.symbolTable.put(functionName, new Defun(functionName, parameters, body));
    }
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
    public void ejecutarItself(Defun def, ArrayList<String> params) throws Exception {
        String correctLine = def.body;
        for(int i=0; i<def.parameters.size(); i++){
            correctLine = correctLine.replace(def.parameters.get(i),params.get(i));
        }
        ArrayList<String> s = new ArrayList<>();
        s.add(correctLine);
        System.out.println(correctLine);
        Main.interpretar(s);
    }
}
