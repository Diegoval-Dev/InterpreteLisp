package Controller;

import Model.*;
import View.UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static UI ui = new UI();
    static Defensiva defensiva = new Defensiva();
    static Factory factory = new Factory();
    public static Map<String, Object> localsVariables= new HashMap<>();
    public static Map<String, Defun> symbolTable = new HashMap<>();

    /**
     *
     * @param args main
     * @throws Exception generar una excepción de tipo "Exception"
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lineas= new ArrayList<>();
        System.out.println("Ingrese las líneas de código (ingrese una línea vacía para finalizar):");
        while (true) {
            String linea = scanner.nextLine();
            if (linea.isEmpty()) {
                break;
            }
            lineas.add(linea);
        }
        scanner.close();
        System.out.println("Interprete LISP");

        interpretar(lineas);

        System.out.println("Se termino");
    }

    /**
     *
     * @param lineas representa una lista de cadenas de texto (String)
     * @throws Exception generar una excepción de tipo "Exception"
     */
    public static void interpretar(ArrayList<String> lineas) throws Exception {
        try{
            for (int i = 0; i<lineas.size(); i++) {
                System.out.println(searchForVariables(lineas.get(i)));
                AbstractFuncion funcion = execute(lineas.get(i));
                assert funcion != null;
                System.out.println(funcion.ejecutar(lineas.get(i)));
            }
        }catch (LispException e){
            ui.print(e.getMessage());
        }

    }

    /**
     *
     * @param line una cadena de texto que representa una línea de código a ser interpretada
     * @return regresa un objeto de tipo "AbstractFuncion"
     * @throws Exception generar una excepción de tipo "Exception"
     */
    public static AbstractFuncion execute(String line) throws Exception {
        try {
           return factory.execute(line);

        }catch (LispException e){
            ui.print(e.getMessage());
        }
        return null;
    }

    /**
     *
     * @param line cadena de texto de codigo Lisp
     * @return regresa el valor asociado a esa clave
     */
    public static String searchForVariables(String line){
        line = line.replace("(","");
        line = line.replace(")","");
        if(localsVariables.containsKey(line)){
            return String.valueOf(localsVariables.get(line));
        }else {
            return "";
        }
    }

}