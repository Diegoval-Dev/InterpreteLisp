package Model;

public class Menor extends AbstractFuncion{
    /**
     * @param line recibe una linea de codigo
     * @return regresa un valor booleano, donde indica si el primer numero en la cadena es menor que el segundo numero
     */
    public String ejecutar(String line){
        String x;
        String y;
        line = line.substring(1,line.length()-1);
        line = line.replace("menor ","");
        String[] parametros = line.split(" ");
        x = parametros[0];
        y = parametros[1];
        return String.valueOf(Integer.parseInt(x) < Integer.parseInt(y));
    }
}
