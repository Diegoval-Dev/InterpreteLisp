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
    public static void main(String[] args) throws Exception {
        System.out.println("Interprete LISP");
        String f = "(setq xx 22)";
        AbstractFuncion funcion = execute(f);
        assert funcion != null;
        System.out.println(funcion.ejecutar(f));
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