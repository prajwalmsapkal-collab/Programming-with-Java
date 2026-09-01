import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}

public class DrivingLicense {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18. Not eligible for driving license.");
        }
        else {
            System.out.println("Eligible for driving license.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validate(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Exception class: " + e.getClass().getSimpleName());
        }

        sc.close();
    }
}