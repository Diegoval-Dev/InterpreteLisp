package Controller;

import Model.AbstractFuncion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Factory{
    public AbstractFuncion execute(String line) throws Exception{
        return null;
    }
    public String KnowFunction(String line){
        String nameFunction = "";
        String quote = ".*\\bQUOTE\\b.*";
        String defun = ".*\\bDEFUN\\b.*";

        if(evaluar("",line)){
            return "ARITMETICA";
        }if(evaluar(quote,line)){
            return "QUOTE";
        }
        if(evaluar(defun,line)){
            return "DEFUN";
        }


        return nameFunction;
    }
    private static boolean evaluar(String regex, String expresion) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(expresion);
        return matcher.find();
    }
}
