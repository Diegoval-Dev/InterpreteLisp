package Test;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void execute() {
    }

    @Test
    void knowFunction() {
        String line = "(+ 1 9)";
        String regexAritmetica = "[^(][0-9][)$]";
        if (evaluar(regexAritmetica,line)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    private static boolean evaluar(String regex, String expresion) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(expresion);
        return matcher.find();
    }
}