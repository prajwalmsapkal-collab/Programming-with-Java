class MyCalc {
    int num1 = 10;
    int num2 = 12;

    void add() {
        int rs = num1 + num2;
        System.out.println("Addition: " + rs);
    }

    void sub() {
        int diff = num1 - num2;
        System.out.println("Subtraction: " + diff);
    }

    void mul() {
        int product = num1 * num2;
        System.out.println("Multiplication: " + product);
    }
}
public class Calc {

    public static void main(String[] args) {
        MyCalc m = new MyCalc();
        m.add();
        m.sub();
        m.mul();
    }
}