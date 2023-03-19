package Model;

import java.util.ArrayList;

public class Quote extends AbstractFuncion{
    /**
     * @param t cadena que tiene la estructura de una lista de caracteres de Lisp
     * @return regresa un ArrayList con los caracteres separados como elementos de la lista.
     */
    public ArrayList<String> text(String t){
        t = t.substring(7,t.length()-1);
        t = t.replace("(","");
        t = t.replace(")","");
        ArrayList<String> arrT = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            String caracter = String.valueOf( t.charAt(i));
            arrT.add(caracter);
        }
        return arrT;
    }

    /**
     * @param line recibe una linea de codigo
     * @return regresa una cadena de texto
     */
    public String ejecutar(String line) {
        String text = text(line).toString();
        return text;
    }
}
