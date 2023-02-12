package Model;

import java.util.ArrayList;

public class Predicado {
    public boolean Atom(String x){
        return false;
    }
    public ArrayList<String> List(String x){
        return new ArrayList<>();
    }
    public boolean Equals(String x, String y){
        return false;
    }
    public boolean Menor(int n1, int n2){
        return false;
    }
    public boolean Mayor(int n1, int n2){
        return false;
    }
}
