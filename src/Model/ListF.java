package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class ListF extends AbstractFuncion{

    public String ejecutar(String line){
        line = line.substring(1,line.length()-1);
        line = line.replace("list ","");
        String[] listSeparada = line.split(" ");
        ArrayList<String> listCreada = new ArrayList<>();
        listCreada.addAll(Arrays.asList(listSeparada));
        return listCreada.toString();
    }
}
