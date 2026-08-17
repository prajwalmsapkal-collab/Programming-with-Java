class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }

    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("This is the child class");
    }
}

public class SuperExample {
    public static void main(String[] args) {    
        Child c = new Child();
        c.display();
    }
}