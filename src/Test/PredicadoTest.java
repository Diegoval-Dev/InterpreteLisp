package Test;

import Model.*;
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
    void TryAtom(){
        Atom atom = new Atom();
        System.out.println(atom.ejecutar("(atom '(+ 2 3)"));
    }

    @Test
    void list() {
        ListF list = new ListF();
        System.out.println(list.ejecutar("(list 1 2 3 7 7 6)"));
    }

    @Test
    void equals() {
        Equals equals = new Equals();
        System.out.println(equals.ejecutar("(equals (gato) 3)"));
    }

    @Test
    void menor() {
        Menor menor = new Menor();
        System.out.println(menor.ejecutar("(menor 5 7)"));
    }

    @Test
    void mayor() {
        Mayor mayor = new Mayor();
        System.out.println(mayor.ejecutar("(mayor 4 3)"));
    }
}