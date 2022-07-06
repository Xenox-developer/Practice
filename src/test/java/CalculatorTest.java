import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.chindin.MainIDEA;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addition(){
        int actual = MainIDEA.calculate("1", "+", "1");
        assertEquals(2, actual);
    }

    @Test
    void multiplication(){
        int actual = MainIDEA.calculate("2", "*", "2");
        assertEquals(4, actual);
    }

    @Test
    void divisionNull(){
        int actual = MainIDEA.calculate("2", "/", "0");
        assertEquals(0, actual);
    }

}