package ec.edu.epn.git.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParametersTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> parametersForAddition() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(0, 0, 0),
                org.junit.jupiter.params.provider.Arguments.of(1, 1, 2),
                org.junit.jupiter.params.provider.Arguments.of(-1, 1, 0),
                org.junit.jupiter.params.provider.Arguments.of(2, 3, 5),
                org.junit.jupiter.params.provider.Arguments.of(-2, -3, -5),
                org.junit.jupiter.params.provider.Arguments.of(10, 5, 15),
                org.junit.jupiter.params.provider.Arguments.of(99, 1, 100),
                org.junit.jupiter.params.provider.Arguments.of(-5, 10, 5),
                org.junit.jupiter.params.provider.Arguments.of(Integer.MAX_VALUE, 0, Integer.MAX_VALUE),
                org.junit.jupiter.params.provider.Arguments.of(Integer.MIN_VALUE, 1, Integer.MIN_VALUE + 1)
        );
    }

    @ParameterizedTest
    @MethodSource("parametersForAddition")
    public void givenParameters_whenAddition_thenOk(int a, int b, int expected) {
        Calculator calc = new Calculator();
        int actual = calc.addition(a, b);
        assertEquals(expected, actual);
    }
}