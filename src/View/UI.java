package View;

import java.util.Scanner;

public class UI {
    public String readCodigo(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public void print(String m){
        System.out.println(m);
    }
}
