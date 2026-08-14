class Calculator {

    // Static variable to count calculations
    static int count = 0;

    // Addition of two integers
    int add(int a, int b) {
        count++;
        return a + b;
    }

    // Addition of two decimal numbers
    double add(double a, double b) {
        count++;
        return a + b;
    }

    // Display total calculations
    static void displayCount() {
        System.out.println("Total calculations performed: " + count);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Integer addition
        System.out.println("Addition of integers: " + calc.add(10, 20));

        // Decimal addition
        System.out.println("Addition of decimals: " + calc.add(5.5, 4.5));

        // Display calculation count
        Calculator.displayCount();
    }
}