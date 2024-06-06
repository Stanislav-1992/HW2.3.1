package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprospringhw2.st.CalculatorService;
import pro.sky.skyprospringhw2.st.CalculatorServiceImpl;

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
    void add(int numOne, int numTwo){
        int excepted = numOne + numTwo;
        int actual = calculatorService.plus(numOne, numTwo);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void minus(int numOne, int numTwo){
        int excepted = numOne - numTwo;
        int actual = calculatorService.minus(numOne, numTwo);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void multiply(int numOne, int numTwo){
        int excepted = numOne * numTwo;
        int actual = calculatorService.multiply(numOne, numTwo);
        assertEquals(excepted, actual);
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(int numOne, int numTwo){
        int excepted = numOne / numTwo;
        float actual = calculatorService.divide(numOne, numTwo);
        assertEquals(excepted, actual);
    }
}