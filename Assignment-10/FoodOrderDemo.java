abstract class FoodOrder {

    double amount;

    public FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}


class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double gst = amount * 0.05;
        double total = amount + gst;

        System.out.println("Dine-In Order");
        System.out.println("Food Amount: Rs." + amount);
        System.out.println("GST: Rs." + gst);
        System.out.println("Total Bill: Rs." + total);
    }
}


class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double packingCharge = 20;
        double total = amount + packingCharge;

        System.out.println("Take-Away Order");
        System.out.println("Food Amount: Rs." + amount);
        System.out.println("Packing Charge: Rs." + packingCharge);
        System.out.println("Total Bill: Rs." + total);
    }
}


public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder dineIn = new DineInOrder(500);
        FoodOrder takeAway = new TakeAwayOrder(500);

        dineIn.calculateBill();

        System.out.println();

        takeAway.calculateBill();
    }
}