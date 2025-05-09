package ec.edu.epn.git.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parametersForAddition() {
        List<Object[]> parametersList = new ArrayList<>();

        parametersList.add(new Object[] {  0,  0,  0 });
        parametersList.add(new Object[] {  1,  1,  2 });
        parametersList.add(new Object[] { -1,  1,  0 });
        parametersList.add(new Object[] {  2,  3,  5 });
        parametersList.add(new Object[] { -2, -3, -5 });
        parametersList.add(new Object[] { 10,  5, 15 });
        parametersList.add(new Object[] { 99,  1,100 });
        parametersList.add(new Object[] { -5, 10,  5 });
        parametersList.add(new Object[] { Integer.MAX_VALUE, 0, Integer.MAX_VALUE });
        parametersList.add(new Object[] { Integer.MIN_VALUE, 1, Integer.MIN_VALUE + 1 });

        return parametersList;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_ok(){
        Calculator calc = new Calculator();
        int actual = calc.addition(a, b);
        assertEquals(expected, actual);
    }

}