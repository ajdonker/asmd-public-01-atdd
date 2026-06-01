package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void acceptanceTest(){
        Calculator calculator = new Calculator();
        calculator.enter(5);
        assertEquals(5, calculator.getResult());

        calculator.enter(6);
        calculator.add();
        assertEquals(11, calculator.getResult());

        calculator.enter(3);
        calculator.add();
        assertEquals(14, calculator.getResult());
        assertEquals(14, calculator.getResult());

        calculator.enter(3);
        assertThrows(IllegalStateException.class, () -> calculator.enter(5));
    }
    @Test
    void MultAcceptanceTest() {
        Calculator calculator = new Calculator();
        calculator.enter(5);
        assertEquals(5, calculator.getResult());

        calculator.enter(6);
        calculator.multiply();
        assertEquals(30, calculator.getResult());

        calculator.enter(2);
        calculator.multiply();
        assertEquals(60, calculator.getResult());

    }
    @Test
    void DivAcceptanceTest(){
        Calculator calculator = new Calculator();
        calculator.enter(6);
        assertEquals(6, calculator.getResult());

        calculator.enter(2);
        calculator.divide();
        assertEquals(3, calculator.getResult());

        calculator.enter(1);
        calculator.divide();
        assertEquals(3, calculator.getResult());

        calculator.enter(0);
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide();
        });
    }
}
