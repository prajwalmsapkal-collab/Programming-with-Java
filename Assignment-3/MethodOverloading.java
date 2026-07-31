class MethodExample {

    int a;
    int b;
    int d;
    static int count = 0;

    public MethodExample() {
        this.a = 10;
        this.b = 20;
        this.d = 0;
        count++;
    }

    public MethodExample(int a, int b) {
        this.a = a;
        this.b = b;
        this.d = 0;
        count++;
    }

    public MethodExample(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
        count++;
    }


    void add() {
        System.out.println("Sum = " + (a + b + d));
    }

    static void showCount() {
        System.out.println("Total MethodExample objects created: " + count);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("Using Default Constructor:");
        MethodExample o1 = new MethodExample();
        o1.add();

        System.out.println();

        System.out.println("Using Parameterized Constructor:");
        MethodExample o2 = new MethodExample(50, 40);
        o2.add();

        System.out.println();

        System.out.println("Using Parameterized Constructor:");
        MethodExample o3 = new MethodExample(50, 40, 60);
        o3.add();

        System.out.println();

        MethodExample.showCount();
    }
}