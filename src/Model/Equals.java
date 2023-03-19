package Model;

public class Equals extends AbstractFuncion{
    /**
     * @param line recibe una linea de codigo
     * @return regresa un String que indica si los dos parámetros son iguales
     */
    public String ejecutar(String line){
        String x;
        String y;
        line = line.substring(1,line.length()-1);
        line = line.replace("equals ","");
        String[] parametros = line.split(" ");
        x = parametros[0];
        y = parametros[1];
        return String.valueOf(x.equals(y));
    }
}
