package Controller;

import Model.*;
import View.UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static UI ui = new UI();
    static Defensiva defensiva = new Defensiva();
    static Factory factory = new Factory();
    public static Map<String, Object> localsVariables= new HashMap<>();
    public static Map<String, Defun> symbolTable = new HashMap<>();
    public static void main(String[] args) throws Exception {
        ArrayList<String> lineas= new ArrayList<>();
        lineas.add("(defun sum (a b) (+ a b)");
        lineas.add("(sum 4 5)");
        System.out.println("Interprete LISP");
        interpretar(lineas);
        System.out.println("Se termino");
    }
    public static ArrayList<AbstractFuncion> interpretar(ArrayList<String> lineas) throws Exception {
        for (int i = 0; i<lineas.size(); i++) {
            AbstractFuncion funcion = execute(lineas.get(i));
            assert funcion != null;
            System.out.println(funcion.ejecutar(lineas.get(i)));
        }

        return null;
    }
    public static AbstractFuncion execute(String line) throws Exception {
        // String line = ui.readCodigo();
        try {
           return factory.execute(line);

        }catch (LispException e){
            ui.print(e.getMessage());
        }
        return null;
    }
}