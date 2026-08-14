import java.util.Scanner;
import java.util.Vector;

public class VectorsExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vector<Integer> numbers = new Vector<>();

        // Adding elements
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Numbers: " + numbers);

        // Removing element at index 1
        numbers.remove(1);

        System.out.println("Numbers after removing element at index 1: " + numbers);

        // Size of Vector
        System.out.println("Size: " + numbers.size());

        // Accessing first element
        System.out.println("Element at index 0: " + numbers.get(0));

        scanner.close();
    }
}