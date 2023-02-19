package Test;

import Model.Defensiva;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DefensivaTest {
    @Test
    public void pruebaFuncion() {
        String expression = "(+ (/ (* (+ 3 2) 3) 5) 5)";
        boolean result = Defensiva.funcionValid(expression);
        assertTrue(result);
        System.out.println("La expresión '" + expression + "' es " + (result ? "válida" : "inválida"));
    }


}
