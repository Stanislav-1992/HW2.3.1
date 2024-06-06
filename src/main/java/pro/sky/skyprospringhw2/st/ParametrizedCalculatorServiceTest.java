package pro.sky.skyprospringhw2.st;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    static Stream <Arguments> data() {
        return Stream.of(
                Arguments.of(2, 3),
                Arguments.of(4, -2),
                Arguments.of(7, 1),
                Arguments.of(14, -89),
                Arguments.of(-33, 55 )

        );
    }
    @ParameterizedTest
    @MethodSource("data")
    void add(int num1, int num2){
        int excepted =num1 + num2;
        int actual = calculatorService.plus(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void minus(int num1, int num2){
        int excepted =num1 - num2;
        int actual = calculatorService.minus(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void multiply(int num1, int num2){
        int excepted =num1 * num2;
        int actual = calculatorService.multiply(num1, num2);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(int num1, int num2){
        int excepted =num1 / num2;
        float actual = calculatorService.divide(num1, num2);
        assertEquals(excepted, actual);
    }
}