package Model;

public class LispException extends RuntimeException{
    public LispException(){
        super();
    }

    /**
     * @param s mensaje de error que se desea mostrar cuando la excepcion es lanzada
     */
    public LispException(String s){
        super(s);
    }
}
