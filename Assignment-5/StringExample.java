import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Literal way of defining String
        String str1 = "Hello";

        // String defined by creating object
        String str2 = new String("I am Prajwal");
            // Reassigning values
        str1 = "Hi";
        str2 = "Python";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        System.out.println("Length: " + str2.length());
        System.out.println("Trimmed: " + str2.trim());
        System.out.println("Uppercase: " + str2.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        scanner.close();
    }
}