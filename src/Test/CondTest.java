package Test;
import org.junit.Assert;
import org.junit.Test;
import Model.Cond;

public class CondTest {

    @Test
    public void testCond() {
        Cond cond = new Cond();
        String resultado = cond.ejecutar("(cond > 5 3)");
        Assert.assertEquals("mayor", resultado);

        resultado = cond.ejecutar("(cond < 5 3)");
        Assert.assertEquals("menor", resultado);

        resultado = cond.ejecutar("(cond = 5 3)");
        Assert.assertEquals("menor", resultado);

        resultado = cond.ejecutar("(cond >= 5 3)");
        Assert.assertEquals("mayor", resultado);

        resultado = cond.ejecutar("(cond <= 5 3)");
        Assert.assertEquals("menor", resultado);

        resultado = cond.ejecutar("(cond invalido 5 3)");
        Assert.assertEquals("Error", resultado);
    }

}
