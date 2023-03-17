package Model;

public class Mayor extends AbstractFuncion{
    public String ejecutar(String line){
        String x;
        String y;
        line = line.substring(1,line.length()-1);
        line = line.replace("mayor ","");
        String[] parametros = line.split(" ");
        x = parametros[0];
        y = parametros[1];
        return String.valueOf(Integer.parseInt(x) > Integer.parseInt(y));
    }
}
