package View;

import java.util.Scanner;

public class UI {
    /**
     * @return regresa una cadena de texto correspondiente
     */
    public String readCodigo(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**
     * @param m cadena de texto que recibe un mensaje como entrada y lo imprime en la consola
     */
    public void print(String m){
        System.out.println(m);
    }
}
