package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atom extends AbstractFuncion{

    /**
     * La función Atom comprueba si la cadena de entrada x es un átomo o no
     * @param x cadena de entrada tomada por la funcion Atom
     * @return regresa una cadena "T" si x es un átomo, y "NIL" si no lo es.
     */
    public String Atom(String x){
        x = x.substring(1,x.length()-1);
        String regex = ".*[()]+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(x);
        if(matcher.find()){
            return "NIL";
        }
        else {
            return "T";
        }
    }

    /**
     * @param line recibe una linea de codigo
     * @return rergesa "T" si x es un átomo y "NIL" en caso contrario
     * @throws LispException muestra un mensaje de excepción en la consola o en la interfaz de usuario
     */
    public String ejecutar(String line) throws LispException{
        line = line.replace("atom ","");
        return Atom(line);
    }
}
