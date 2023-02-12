package Model;

public class Quote {
    public String text(String t){
        t = t.substring(6,t.length()-1);
        return t;
    }
}
