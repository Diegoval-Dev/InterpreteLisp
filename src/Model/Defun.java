package Model;

import java.util.List;

public class Defun extends AbstractFuncion{
    private String name;
    private List<String> args;
    private List<Object> body;

    public String getName() {
        return name;
    }

    public List<String> getArgs() {
        return args;
    }

    public List<Object> getBody() {
        return body;
    }


}
