package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atom extends AbstractFuncion{
    public String Atom(String x){
        x = x.substring(1,x.length()-1);
        String regex = ".*[()]+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(x);
        if(matcher.find()){
            return "NIL";
        }
        else {
            return "T";
        }
    }
    public String ejecutar(String line) throws LispException{
        line = line.replace("atom ","");
        return Atom(line);
    }
}
