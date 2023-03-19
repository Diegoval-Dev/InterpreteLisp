package Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FactoryTest {

    @Test
    void execute() {
    }

    @Test
    void knowFunction() {
        String line = "(+ 1 9)";
        String regexAritmetica = "\\([+*/-]\\s[0-9]+\\s[0-9]+\\)";
        assertTrue(evaluar(regexAritmetica,line));
    }
    private static boolean evaluar(String regex, String expresion) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(expresion);
        return matcher.find();
    }
}