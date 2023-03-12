package Test;

import Controller.Factory;
import Model.AbstractFuncion;
import Model.LispException;

class MainTest {
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
            Factory factory = new Factory();
            return factory.execute(line);

        }catch (LispException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void pruebaSplit(){
        String line = "(setq x 4)";
        String nombre;
        String valor;
        line = line.replace("(", "");
        line = line.replace(")","");
        line = line.replace("setq ","");
        System.out.println(line);
        String[] cadena = line.split(" ");
        System.out.printf(cadena[0]);
    }
}