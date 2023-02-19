package Test;
import Model.Defensiva;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefensivaTest {
    @Test
    public void testValidarExpre() {

        // Expresión aritmética válida
        String expreValida = "4 + 6 * 8";
        assertDoesNotThrow(() -> Defensiva.validar(expreValida));

        // Expresión aritmética inválida
        String expreInvalida = "5 +";
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Defensiva.validar(expreInvalida));
        assertEquals("La expresión aritmética está mal formada", exception.getMessage());
    }


}
