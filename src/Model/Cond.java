package Model;
import java.util.List;
import java.util.function.Predicate;
import java.lang.Object;

/**
 * Referencia de: http://arantxa.ii.uam.es/~rcobos/teaching/esp/ia/lisp0.pdf
 */

public class Cond extends AbstractFuncion{
    public static Object cond(List<List<Object>> clauses) {
        for (List<Object> clause : clauses) {
            Object condition = clause.get(0);
            Object result = clause.get(1);

            if (condition == null) {
                return result;
            } else if (condition instanceof Boolean && (Boolean) condition) {
                return result;
            } else if (condition instanceof Predicate<?> && ((Predicate<?>) condition).test(null)) {
                return result;
            } else if (condition.equals("T")) {
                return result;
            }
        }
        return null;
    }



}
