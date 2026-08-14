class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void area() {
        int a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}