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
     * El método cond recorre la lista de condiciones y expresiones en el arreglo lista, evaluando cada una de las condiciones
     * @param lista lista de condiciones y sus respectivas expresiones
     * @return si no hay condicones true retorna null
     */
    public static Object cond(Object[] lista) {
        for (int i = 0; i < lista.length; i++) {
            Object[] listN = (Object[]) lista[i];
            if (listN[0].equals("t") || (Boolean) listN[0]) {
                return listN[1];
            }
        }
        return null;
    }

}
