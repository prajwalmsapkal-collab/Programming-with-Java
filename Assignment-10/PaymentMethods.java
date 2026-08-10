abstract class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void transaction();
}


class CreditCard extends Payment {

    String cardNumber;

    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void transaction() {
        System.out.println("Credit Card payment of Rs." + amount
                + " using Card: " + cardNumber + " is successful.");
    }
}


class UPI extends Payment {

    String upiId;

    UPI(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    void transaction() {
        System.out.println("UPI payment of Rs." + amount
                + " using UPI ID: " + upiId + " is successful.");
    }
}


public class PaymentMethods {

    public static void main(String[] args) {

        Payment card = new CreditCard(250.50, "2417-5214-6958");
        Payment upi = new UPI(150.00, "student@upi");

        card.transaction();
        upi.transaction();
    }
}