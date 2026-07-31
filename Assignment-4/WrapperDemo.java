import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String str2 = sc.nextLine();

        // Convert String to Wrapper Objects
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        // Unboxing
        int a = num1.intValue();
        int b = num2.intValue();

        System.out.println("\nEntered Numbers:");
        System.out.println("First Number  = " + a);
        System.out.println("Second Number = " + b);

        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition       = " + (a + b));
        System.out.println("Subtraction    = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + ((double) a / b));
            System.out.println("Remainder= " + (a % b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("\nWrapper Class Methods:");
        System.out.println("Maximum = " + Integer.max(a, b));
        System.out.println("Minimum = " + Integer.min(a, b));
        System.out.println("Sum     = " + Integer.sum(a, b));

        // Autoboxing
        int x = 100;
        Integer wrapperX = x;

        System.out.println("\nAutoboxing:");
        System.out.println("Primitive Value = " + x);
        System.out.println("Wrapper Object  = " + wrapperX);

        // Unboxing
        Integer wrapperY = Integer.valueOf(250);
        int y = wrapperY;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Object  = " + wrapperY);
        System.out.println("Primitive Value = " + y);

        sc.close();
    }
}