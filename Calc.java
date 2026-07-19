class MyCalc {

    // Instance variables
    int num1 = 10;
    int num2 = 12;

    // Method for addition
    void add() {
        int rs = num1 + num2;
        System.out.println("Addition: " + rs);
    }

    // Method for subtraction
    void sub() {
        int diff = num1 - num2;
        System.out.println("Subtraction: " + diff);
    }

    // Method for multiplication
    void mul() {
        int product = num1 * num2;
        System.out.println("Multiplication: " + product);
    }
}


public class Calc {

    public static void main(String[] args) {

        // Creating object of MyCalc class
        MyCalc m = new MyCalc();

        // Calling methods
        m.add();
        m.sub();
        m.mul();
    }
}