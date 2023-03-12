package Model;

import java.util.ArrayList;

public class Quote extends AbstractFuncion{
    public ArrayList<String> text(String t){
        t = t.substring(6,t.length()-1);
        t = t.replace("(","");
        t = t.replace(")","");
        ArrayList<String> arrT = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            String caracter = String.valueOf( t.charAt(i));
            arrT.add(caracter);
        }
        return arrT;
    }
}
