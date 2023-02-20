package Test;

import Model.Defensiva;

import org.junit.Test;
import static Model.Defensiva.sinLetras;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DefensivaTest {
    @Test
    public void pruebaFuncion() {
        String expression = "(+ (/ (* (+ 3 2) 3) 5) 5)";
        boolean result = Defensiva.funcionValid(expression);
        assertTrue(result);
        System.out.println("La expresión '" + expression + "' es " + (result ? "válida" : "inválida"));
    }


    @Test
    public void testExpresionAritmeticaValida() {
        String expression2 = "(+ (+1  5) 5)";
        boolean result2 = Defensiva.sinLetras(expression2);
        assertTrue(result2);
        System.out.println("La expresión '" + expression2 + "' es " + (result2 ? "válida" : "inválida"));
    }



}
