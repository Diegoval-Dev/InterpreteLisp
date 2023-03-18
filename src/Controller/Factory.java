package Controller;

import Model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Controller.Main.symbolTable;

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
            case "ATOM":
                return new Atom();
            case "LIST":
                return new ListF();
            case "EQUALS":
                return new Equals();
            case "MENOR":
                return new Menor();
            case "MAYOR":
                return new Mayor();
            default:
                String nameOther = line.trim().replace("(","").replace(")","");
                String[] funcion = nameOther.split(" ");
                ArrayList<String> arr = new ArrayList<>(Arrays.asList(funcion));

                String nombreFuncion = arr.remove(0);
                ArrayList<String> params  = arr;

                if(symbolTable.isEmpty()){
                    System.exit(0);
                }else{
                    Defun def = symbolTable.get(nombreFuncion);
                    def.ejecutarItself(def,params);
                }


        }
        return null;
    }
    public String KnowFunction(String line){
        String nameFunction = "";
        String quote = ".*\\bquote\\b.*";
        String defun = ".*\\bdefun\\b.*";
        String setq = ".*\\bsetq\\b.*";
        String cond = ".*\\bcond\\b.*";
        String atom = ".*\\batom\\b.*";
        String list = ".*\\blist\\b.*";
        String equals = ".*\\bequals\\b.*";
        String menor = ".*\\bmenor\\b.*";
        String mayor = ".*\\bmayor\\b.*";

        if(evaluar(quote,line)){
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
        if(evaluar(atom,line)){
            return "ATOM";
        }
        if(evaluar(list,line)){
            return "LIST";
        }
        if(evaluar(equals,line)){
            return "EQUALS";
        }
        if(evaluar(menor,line)){
            return "MENOR";
        }
        if(evaluar(mayor,line)){
            return "MAYOR";
        }
        if(evaluar(".*[+\\-*/].*",line)){
            return "ARITMETICA";
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
