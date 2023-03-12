package Controller;

import Model.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Factory{
    public AbstractFuncion execute(String line) throws Exception{
        String function = KnowFunction(line);
        switch (function){
            case "ARITMETICA":
                return new Aritmetica();
            case "DEFUN":
                return new Defun();
            case "QUOTE":
                return new Quote();
            case "SETQ":
                return new SetQ();
            case "COND":
                return new Cond();
            default:
                throw new LispException("FUNCION NO RECONOCIDA, REVISE SU SYNTAXIS");
        }
    }
    public String KnowFunction(String line){
        String nameFunction = "";
        String quote = ".*\\bQUOTE\\b.*";
        String defun = ".*\\bDEFUN\\b.*";
        String setq = ".*\\bsetq\\b.*";
        String cond = ".*\\bCond\\b.*";

        if(evaluar(".*[+\\-*/].*",line)){
            return "ARITMETICA";
        }if(evaluar(quote,line)){
            return "QUOTE";
        }
        if(evaluar(defun,line)){
            return "DEFUN";
        }
        if(evaluar(setq, line)){
            return "SETQ";
        }
        if(evaluar(cond,line)){
            return "COND";
        }
        else{
        return nameFunction;
        }
    }
    private static boolean evaluar(String regex, String expresion) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(expresion);
        return matcher.find();
    }
}
