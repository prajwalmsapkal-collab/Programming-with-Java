// Anonymous class
class Delivery {
    void status() {
    }
}

class FoodOrder {
    String food;
    int quantity;
    double price;

    FoodOrder(String f, int q, double p) {
        food = f;
        quantity = q;
        price = p;
    }

    // Inner class
    class OrderDetails {
        void show() {
            System.out.println("Food: " + food);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: Rs. " + price);
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        FoodOrder order = new FoodOrder("Burger", 2, 250);

        // Creating object of inner class
        FoodOrder.OrderDetails details = order.new OrderDetails();
        details.show();

        // Anonymous class
        Delivery d = new Delivery() {
            void status() {
                System.out.println("Delivery Status: Order is out for delivery.");
            }
        };

        d.status();
    }
}

