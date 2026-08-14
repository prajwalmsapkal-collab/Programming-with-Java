import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // User input
        System.out.print("Enter fruit name: ");
        String newFruit = scanner.nextLine();
        fruits.add(newFruit);

        System.out.print("Enter number: ");
        int newNum = scanner.nextInt();

        numbers.add(newNum);

        // Removing elements
        System.out.println("\nFruits: " + fruits);

        fruits.remove(newFruit);
        fruits.remove("Banana");
        fruits.remove("Cherry");

        System.out.println("Fruits after removing 3 elements: " + fruits);

        fruits.remove("Apple");

        System.out.println("Fruits after removing 4 elements: " + fruits);

        System.out.println("\nNumbers: " + numbers);

        numbers.remove(2);
        numbers.remove(1);

        System.out.println("Numbers after removing 2 elements: " + numbers);

        numbers.remove(0);

        System.out.println("Numbers after removing 3 elements: " + numbers);

        // ArrayList methods
        System.out.println("\nFruit List Size : " + fruits.size());
        System.out.println("Contains Apple? : " + fruits.contains("Apple"));

        System.out.println("Number List Size : " + numbers.size());

        if (!numbers.isEmpty()) {
            System.out.println("First Element : " + numbers.get(0));
        } else {
            System.out.println("Number list is empty.");
        }

        scanner.close();
    }
}