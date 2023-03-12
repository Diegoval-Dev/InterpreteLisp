package Model;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Predicado extends AbstractFuncion{
    public String Atom(String x){
        x = x.substring(1,x.length()-1);
        String regex = ".*[()]+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(x);
        if(matcher.find()){
            return "nil";
        }
        else {
            return "T";
        }
    }

    public ArrayList<String> List(String x){
        ArrayList<String> listaArr = new ArrayList<String>();
        listaArr.add(x);
        return listaArr;
    }

    public boolean Equals(String x, String y){
        return x.equals(y);
    }

    public boolean Menor(int n1, int n2){
        return n1 < n2;
    }

    public boolean Mayor(int n1, int n2){
        return n1 > n2;
    }

}
