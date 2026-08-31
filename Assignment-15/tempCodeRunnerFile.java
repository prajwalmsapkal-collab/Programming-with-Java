import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginProgram {

    static void login(String password) throws InvalidPasswordException {
        String correctPassword = "java123";

        if (!password.equals(correctPassword)) {
            throw new InvalidPasswordException("Invalid Password!");
        }

        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            login(password);
        }
        catch (InvalidPasswordException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Login process completed.");
            sc.close();
        }
    }
}