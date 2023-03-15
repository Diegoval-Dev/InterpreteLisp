package Model;
import java.util.List;
import java.util.function.Predicate;
import java.lang.Object;

/**
 * Referencia de: http://arantxa.ii.uam.es/~rcobos/teaching/esp/ia/lisp0.pdf
 * Referencia de: https://www.manualweb.net/java/operadores-condicionales-java/
 */

public class Cond extends AbstractFuncion{
    /**
     *
     * @param casos representacion de una lista de clausulas
     * @return Si ningun caso cumple su condicion, la funcion retorna null
     */
    public static Object cond(List<List<Object>> casos) {
        for (List<Object> clause : casos) {
            Object condn = clause.get(0);
            Object resul = clause.get(1);

            if (condn == null) {
                return resul;
            } else if (condn instanceof Boolean && (Boolean) condn) {
                return resul;
            } else if (condn instanceof Predicate<?> && ((Predicate<?>) condn).test(null)) {
                return resul;
            } else if (condn.equals("T")) {
                return resul;
            }
        }
        return null;
    }



}
