package Model;

public class Quote extends AbstractFuncion{
    public String text(String t){
        t = t.substring(6,t.length()-1);
        return t;
    }
}
