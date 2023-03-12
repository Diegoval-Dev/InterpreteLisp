package Test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QuoteTest {

    @Test
    void text() {
        String t = "(quote (+ 2 2 A 2))";

        t = t.substring(6,t.length()-1);
        t = t.replace("(","");
        t = t.replace(")","");
        ArrayList<String> arrT = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            String caracter = String.valueOf( t.charAt(i));
            arrT.add(caracter);
        }
        System.out.println(arrT);
    }
}