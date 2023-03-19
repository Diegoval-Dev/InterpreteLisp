package Model;

import java.util.Stack;

public class Aritmetica extends AbstractFuncion{
    Stack<Integer> stack = new Stack<Integer>();

    /**
     * @param expresion expresión aritmética en notación polaca inversa
     * @return regresa el resultado de dicha expresión como un entero
     */
    public int Control(String expresion){
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
        return numeros.pop();
    }

    /**
     * @param line recibe una linea de codigo
     * @return regresa el resultado como una cadena de texto
     */
    public String ejecutar(String line){
        return (String.valueOf(Control(line)));
    }
}
