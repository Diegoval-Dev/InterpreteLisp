package Model;

import java.util.ArrayList;

public class Predicado {
    public boolean Atom(String x){
        return false; //o true
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
