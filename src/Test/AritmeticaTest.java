package Test;

import java.util.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AritmeticaTest {

    @Test
    void control() {
        String expresion = "(+ (+ (+ 1 1) 2) 6)";
        Stack<Integer> numeros = new Stack<>();
        Stack<String> operadores = new Stack<>();


        for (int i = 0; i < expresion.length(); i++){
            String x = String.valueOf(expresion.charAt(i));
            switch (x){
                case " ":
                case "(":
                    //Do nothing
                    break;
                case "+":
                case "/":
                case "-":
                case "*":
                    operadores.push(x);
                    break;
                case ")":
                    Integer n2 = numeros.pop();
                    Integer n1 = numeros.pop();
                    String op = operadores.pop();
                    switch (op){
                        case "+":
                            numeros.push(n1+n2);
                            break;
                        case "-":
                            numeros.push(n1-n2);
                            break;
                        case "/":
                            numeros.push(n1/n2);
                            break;
                        case "*":
                            numeros.push(n1*n2);
                            break;
                    }

                    break;
                default:
                    numeros.push(Integer.parseInt(x));
                    break;
            }
        }
        assertEquals(10, numeros.pop());

    }

    @Test
    void deleteParentesis() {
        String expresion = "(+ (+ (+ 1 1) 2) 6)";
        expresion = expresion.replace("(","");
        expresion = expresion.replace(")","");
        expresion = expresion.replace(" ", "");
        assertEquals("+++1126", expresion);
    }


}