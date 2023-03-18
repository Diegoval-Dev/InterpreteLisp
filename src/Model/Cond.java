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
     * @param comparacion compara la operacion aritmetica
     * @param a entero representativo del primer valor en comparar
     * @param b entero representativo del segundo valor en comparar
     * @param mayor devuelve si a es mayor que b
     * @param menor devuelve si a es menor que b
     * @return retorna un objeto String
     */
    public static String cond(String comparacion, int a, int b, String mayor, String menor) {
        switch(comparacion) {
            case ">":
                if (a > b) {
                    return mayor;
                } else {
                    return menor;
                }
            case "<":
                if (a < b) {
                    return mayor;
                } else {
                    return menor;
                }
            case ">=":
                if (a >= b) {
                    return mayor;
                } else {
                    return menor;
                }
            case "<=":
                if (a <= b) {
                    return mayor;
                } else {
                    return menor;
                }
            case "=":
                if (a == b) {
                    return mayor;
                } else {
                    return menor;
                }
            default:
                return "Error";
        }
    }
    public String ejecutar(String line){

    }
}
