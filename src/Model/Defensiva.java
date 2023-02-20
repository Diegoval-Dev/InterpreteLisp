package Model;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;


/**
 * Clase que detecta si la sintaxis esta mala
 */
public class Defensiva {
    public static boolean funcionValid(String expression) {
        Stack<Character> stackFun = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ex = expression.charAt(i);

            if (ex == '(') {
                stackFun.push(ex);
            } else if (ex == ')') {
                if (stackFun.isEmpty() || stackFun.pop() != '(') {
                    return false;
                }
            }
        }

        return stackFun.isEmpty();
    }

    /**
     * Expresión regular encargada de permitir solo números y operadores aritméticos
     * donde el objeto matcherCompro comprueba que la expresion anterior coincida con las especificaciones de patron
     * @param expresion2
     * @return
     */
    public static boolean sinLetras(String expresion2) {

        Pattern patron = Pattern.compile("^[0-9+\\-*/()\\s]+$");
        Matcher matcherCompro = patron.matcher(expresion2);
        return matcherCompro.matches();
    }
}
