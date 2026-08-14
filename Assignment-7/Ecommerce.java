interface Product {
    void display();
}

class ProductDetails {
    String name;
    double price;

    ProductDetails(String n, double p) {
        name = n;
        price = p;
    }
}

class ElectronicProduct extends ProductDetails implements Product {

    ElectronicProduct(String n, double p) {
        super(n, p);
    }

    public void display() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: Rs. " + price);
    }
}

class ClothingProduct extends ProductDetails implements Product {

    ClothingProduct(String n, double p) {
        super(n, p);
    }

    public void display() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: Rs. " + price);
    }
}

class GroceryProduct extends ProductDetails implements Product {

    GroceryProduct(String n, double p) {
        super(n, p);
    }

    public void display() {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: Rs. " + price);  
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        ElectronicProduct e = new ElectronicProduct("Laptop", 50000);
        ClothingProduct c = new ClothingProduct("T-Shirt", 800);
        GroceryProduct g = new GroceryProduct("Rice", 600);

        e.display();
        c.display();
        g.display();
    }
}