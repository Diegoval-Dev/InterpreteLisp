package Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import Model.Cond;

public class CondTest {

    @Test
    public void testCond() {
        List<List<Object>> casos = new ArrayList<List<Object>>();

        casos.add(Arrays.asList(">", 5, 3));
        casos.add(Arrays.asList("=", 5, 3));
        casos.add(Arrays.asList("T", "hello"));

        Object result = Cond.cond(casos);
        Assert.assertEquals("hello", result);
    }


}
