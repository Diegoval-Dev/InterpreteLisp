package Test;

import Controller.Factory;
import Model.AbstractFuncion;
import Model.LispException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Interprete LISP");
        String f = "(+ (* 2 5) 4)";
        AbstractFuncion funcion = execute(f);
        assert funcion != null;
        System.out.println(funcion.ejecutar(f));
    }
    public static AbstractFuncion execute(String line) throws Exception {
        // String line = ui.readCodigo();
        try {
            Factory factory = new Factory();
            return factory.execute(line);

        }catch (LispException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}