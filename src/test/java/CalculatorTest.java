
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.sum(5, 3));
    }
}
