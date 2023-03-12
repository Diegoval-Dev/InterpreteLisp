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
        lineas.add("(defun doble (x y) (* 1 2))");
        lineas.add("(doble)");
        for (String line: lineas) {
            interpretar(line);
        }
    }
    public static ArrayList<AbstractFuncion> interpretar(ArrayList<String> line) throws Exception {
        System.out.println("Interprete LISP");
        AbstractFuncion funcion = execute(line);
        assert funcion != null;
        System.out.println(funcion.ejecutar(line));
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