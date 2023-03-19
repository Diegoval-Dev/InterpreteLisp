package Model;

import Controller.Main;

public class SetQ extends AbstractFuncion{

    /**
     * @param line recibe una linea de codigo
     * @return regresa una cadena que indica el nombre y valor de la variable creada
     */
    public String ejecutar(String line) {
        line = line.replace("(", "");
        line = line.replace(")","");
        line = line.replace("setq ","");
        String[] cadena = line.split(" ");
        Main.localsVariables.put(cadena[0].trim(),cadena[1].trim());
        return "Variable creada con el nombre de: "+cadena[0].trim()+" con el valor de: "+ cadena[1].trim();
    }
}
