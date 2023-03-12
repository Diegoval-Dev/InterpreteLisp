package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Object call(List<Object> arguments, Map<String, Defun> symbolTable) {
        // Verificar que la cantidad de argumentos sea la correcta
        if (arguments.size() != args.size()) {
            throw new RuntimeException("Número incorrecto de argumentos para la función " + name);
        }
        // Crear un nuevo ámbito para la función con los argumentos
        Map<String, Object> localScope = new HashMap<>();
        for (int i = 0; i < args.size(); i++) {
            localScope.put(args.get(i), arguments.get(i));
        }

        // Ejecutar el cuerpo de la función en su ámbito local
        Object result = null;
        for (Object expr : body) {
            result = LispInterpreter.eval(expr, symbolTable, localScope);
        }

        return result;
    }
}
