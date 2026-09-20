import java.util.Scanner;

public class Login {
    public void authenticate(String password) {
        String correctPassword = "java123";

        if (!password.equals(correctPassword)) {
            throw new IllegalArgumentException("Password is incorrect");
        }
        else {
            System.out.println("Login Successful");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login login = new Login();

        try {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            login.authenticate(password);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Error class: " + e.getClass().getSimpleName());
        }
        finally {
            System.out.println("Login attempt finished. Closing session.");
            sc.close();
        }
    }
}