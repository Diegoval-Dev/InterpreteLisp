package Controller;

import Model.Defensiva;
import Model.LispException;
import View.UI;

public class Main {
    static UI ui = new UI();
    static Defensiva defensiva = new Defensiva();
    static Factory factory = new Factory();
    public static void main(String[] args) {
        System.out.println("Interprete LISP");

    }
    public void execute() throws Exception {
        String line = ui.readCodigo();
        try {
            factory.execute(line);
        }catch (LispException e){
            ui.print(e.getMessage());
        }
    }
}