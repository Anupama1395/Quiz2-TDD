import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.sum(5, 3));
    }

    @Test
    void testSubtract() {
    Calculator calculator = new Calculator();

    assertEquals(2, calculator.subtract(5, 3));
    assertEquals(-8, calculator.subtract(-5, 3));
}

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();

        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-15, calculator.multiply(-5, 3));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-6, 3));
    }

    @Test
    void testIsEven() {
        Calculator calculator = new Calculator();

        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }
    @Test
    void testDivideByZero() {
        Calculator calculator = new Calculator();

        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0)
        );
    }
}


