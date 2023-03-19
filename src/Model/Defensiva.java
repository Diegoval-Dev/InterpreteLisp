package Model;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;


/**
 * Referencia de: https://stackoverflow.com/questions/33027500/java-how-do-i-code-optional-regex-patterns-with-a-matcher
 * Referencia de: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
 * Clase que detecta si la sintaxis esta mala
 */
public class Defensiva {
    /**
     * Verifica si los paréntesis de la expresión están correctamente emparejados y balanceados
     * @param expression expresion aritmrtica representada en cadena de texto
     * @return regresa true si los paréntesis están balanceados y false en caso contrario.
     */
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
     * @param expresion2 cadena de texto
     * @return regresa true si la cadena cumple con esta condición y false si no la cumple
     */
    public static boolean sinLetras(String expresion2) {

        Pattern patron = Pattern.compile("^[0-9+\\-*/()\\s]+$");
        Matcher matcherCompro = patron.matcher(expresion2);
        return matcherCompro.matches();
    }
}
