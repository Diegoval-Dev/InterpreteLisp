package Test;
import org.junit.Test;
import Model.Cond;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondTest {

    @Test
    public void testCondTrue() {
        Object[] lista = {
                new Object[] {true, 100},
                new Object[] {5 < 3, 200},
                new Object[] {7 == 7, 300},
                new Object[] {"default", 400}
        };

        assertEquals(100, Cond.cond(lista));
        System.out.println("Test Cond True: "+ Cond.cond(lista));
    }


    @Test
    public void TestCondFalse() {
        Object[] lista = {
                new Object[] {false, 10},
                new Object[] {2 == 2, 20},
                new Object[] {3 < 2, 30},
                new Object[] {"default", 40}
        };

        assertEquals(20, Cond.cond(lista));
        System.out.println("Test Cond False: "+ Cond.cond(lista));
    }


}
