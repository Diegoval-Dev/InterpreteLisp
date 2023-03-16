package Test;
import org.junit.Test;
import Model.Cond;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondTest {

    @Test
    public void TestCond() {
        Object[] lista = {
                new Object[] {false, 10},
                new Object[] {2 == 2, 20},
                new Object[] {3 < 2, 30},
                new Object[] {"default", 40}
        };

        assertEquals(20, Cond.cond(lista));
    }
}
