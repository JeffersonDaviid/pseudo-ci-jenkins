package ec.edu.epn.git.calculator;

import org.junit.jupiter.api.*;


import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator calc = null;


    @BeforeAll
    public static void setUpClass (){
        calc = new Calculator();
        System.out.println("Called setUpClass");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Called setUp");
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        int expected = 5;
        int actual = calc.addition(3,2);

        assertEquals(expected,actual);
        System.out.println("Test 1");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(2, calc.subtraction(5,3));
        System.out.println("Test 2");

    }

    @Test()
    public void given_two_integers_when_division_then_ok(){
        assertEquals(5, calc.division(15,3));
        System.out.println("Test 3");
    }

    @Test
    void givenDivisionByZero_whenDivision_thenThrowsException() {
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () -> calc.division(15, 0),
                "Debería lanzarse ArithmeticException al dividir por cero"
        );
        assertTrue(ex.getMessage().contains("/ by zero"));
        System.out.println("Test excepción OK");
    }

    @Test()
    @Timeout(value= 100, unit = TimeUnit.MILLISECONDS)
    public void give_two_integers_when_multiplication_then_ok(){
        assertEquals(6, calc.multiplication(2,3));
        System.out.println("Test 4");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Called tearDown");
    }

    @AfterAll
    public static void tearDownClass(){
        calc = null;
        System.out.println("Called tearDownClass");
    }

}