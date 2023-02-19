package Model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que detecta si la sintaxis esta mala
 */
public class Defensiva {
    private static final Pattern PATRON_EXPRESION = Pattern.compile("^\\d+(\\s*[+\\-*/]\\s*\\d+)*$");

    public static void validar(String expresion) throws IllegalArgumentException {
        Matcher patrones = PATRON_EXPRESION.matcher(expresion);
        if (!patrones.matches()) {
            throw new IllegalArgumentException("La expresión aritmética está mal formada");
        } else {
            System.out.println("La expresión aritmética es válida");
        }
    }


}
