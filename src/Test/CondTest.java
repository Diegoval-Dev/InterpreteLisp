package Test;
import org.junit.Assert;
import org.junit.Test;
import Model.Cond;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondTest {

    @Test
    public void testCond() {
        String resultado = Cond.cond(">", 5, 3, "mayor", "menor");
        Assert.assertEquals("mayor", resultado);

        resultado = Cond.cond("<", 5, 3, "mayor", "menor");
        Assert.assertEquals("menor", resultado);

        resultado = Cond.cond("=", 5, 3, "mayor", "menor");
        Assert.assertEquals("menor", resultado);

        resultado = Cond.cond(">=", 5, 5, "mayor", "menor");
        Assert.assertEquals("mayor", resultado);

        resultado = Cond.cond("<=", 5, 5, "mayor", "menor");
        Assert.assertEquals("mayor", resultado);

        resultado = Cond.cond("invalido", 5, 3, "mayor", "menor");
        Assert.assertEquals("Error", resultado);
    }

}
