package Model;

import java.util.Stack;


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
}
