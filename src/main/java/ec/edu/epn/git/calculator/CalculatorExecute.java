package ec.edu.epn.git.calculator;

public class CalculatorExecute {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.multiplication(3, 5);
        System.out.println("Result of multiplication(3, 5) is: " + result);

        result = calculator.addition(5, 8);
        System.out.println("Result of addition(5, 8) is: " + result);

        result = calculator.subtraction(5, 8);
        System.out.println("Result of subtraction(5, 8) is: " + result);

        result = calculator.division(5, 8);
        System.out.println("Result of division(5, 8) is: " + result);

        System.out.println("End of calculator operations v11 test desde maven");

    }
}
