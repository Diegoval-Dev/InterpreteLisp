package Test;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PredicadoTest {

    @Test
    void atom() {
        String x = "(atom 'foo)";
        x = x.substring(1,x.length()-1);
        String regex = ".*[()]+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(x);
        if(matcher.find()){
            System.out.println("nil");
        }
        else {
            System.out.println("T");
        }
    }

    @Test
    void list() {
    }

    @Test
    void equals() {
    }

    @Test
    void menor() {
    }

    @Test
    void mayor() {
    }
}