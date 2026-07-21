class Restaurant {

    static int totalOrders = 0;

    void bill(double amount) {
        totalOrders++;
        System.out.println("Dine-in Bill:" + amount);
    }

    void bill(double amount, boolean takeaway) {
        totalOrders++;
        System.out.println("Takeaway Bill:" + (amount + 20));
    }

    void bill(double amount, String address) {
        totalOrders++;
        System.out.println("Delivery Bill: " + (amount + 50));
        System.out.println("Delivery Address: " + address);
    }

    static void showTotalOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
}

public class RestaurantBilling {

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        r.bill(500);
        r.bill(350, true);
        r.bill(700, "Lavale, Pune");

        Restaurant.showTotalOrders();
    }
}