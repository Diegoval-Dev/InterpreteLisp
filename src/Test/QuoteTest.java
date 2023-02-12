package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuoteTest {

    @Test
    void text() {
        String t = "(quote (+ 2 2))";
        t = t.substring(7,t.length()-1);
        System.out.println(t);
    }
}