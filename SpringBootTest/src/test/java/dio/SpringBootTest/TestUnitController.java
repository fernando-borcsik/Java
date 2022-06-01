package dio.SpringBootTest;

import dio.SpringBootTest.controller.TestController;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestUnitController {

    @Test
    public void TestUnit() {
        TestController controller = new TestController();
        String resultado = controller.saudacao("DIO");
        assertEquals("Bem vindo, DIO", resultado);
    }

}
