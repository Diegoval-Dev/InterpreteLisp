package Test;

import java.util.Stack;

class AritmeticaTest {

    @org.junit.jupiter.api.Test
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
        System.out.println(numeros.pop());

    }

    @org.junit.jupiter.api.Test
    String deleteParentesis(String expresion) {
        expresion = expresion.replace("(","");
        expresion = expresion.replace(")","");
        expresion = expresion.replace(" ", "");
        return expresion;
    }
}