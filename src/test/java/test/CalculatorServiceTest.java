package test;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import pro.sky.skyprospringhw2.st.CalculatorService;
import pro.sky.skyprospringhw2.st.CalculatorServiceImpl;
import pro.sky.skyprospringhw2.st.DivisionByZeroException;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void sumPositive() {
        Assertions.assertEquals(10,calculatorService.plus(3,7));
    }

    @Test
    void sumNegative() {

        Assertions.assertEquals(-10, calculatorService.plus(-3, -7));
    }

    @Test
    void sumSymmetry() {
        Assertions.assertEquals(calculatorService.plus(3,4),calculatorService.plus(4,3));
    }
    @Test
    void minusPositive() {
        Assertions.assertEquals(-4,calculatorService.minus(3,7));
    }

    @Test
    void minusNegative() {
        Assertions.assertEquals(4, calculatorService.minus(-3, -7));
    }
    @Test
    void minusNotSymmetry() {
        Assertions.assertNotEquals(calculatorService.minus(3,4),calculatorService.minus(4,3));
    }
    @Test
    void multiplyPositive() {
        Assertions.assertEquals(12,calculatorService.multiply(3,4));
    }

    @Test
    void multiplyNegative() {
        Assertions.assertEquals(-12, calculatorService.multiply(3, -4));
    }

    @Test
    void multiplySymmetry() {
        Assertions.assertEquals(calculatorService.multiply(3,4),calculatorService.multiply(4,3));
    }
    @Test
    void dividePositive() {
        Assertions.assertEquals(0.75,calculatorService.divide(3,4));
    }

    @Test
    void divideNegative() {
        Assertions.assertEquals(-5, calculatorService.divide(20, -4));
    }

    @Test
    void divisionByZero() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> {
            calculatorService.divide(5, 0);
        });
    }
}