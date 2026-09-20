import java.util.Scanner;

public class ATMAuthentication {
    public void authenticate(String inp_pin) {
        String pin = "178267";

        if (!inp_pin.equals(pin)) {
            throw new IllegalArgumentException("PIN is incorrect");
        }
        else {
            System.out.println("PIN Verified Successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATMAuthentication login = new ATMAuthentication();

        try {
            System.out.print("Enter PIN: ");
            String inp_pin = sc.nextLine();

            login.authenticate(inp_pin);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Error class: " + e.getClass().getSimpleName());
        }
        finally {
            System.out.println("PIN verification completed. Closing session.");
            sc.close();
        }
    }
}