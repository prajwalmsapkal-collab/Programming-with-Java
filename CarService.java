// Anonymous class
class Service {
    void perform() {
    }
}

class Car {
    String name;
    String fuel;
    int mileage;

    Car(String n, String f, int m) {
        name = n;
        fuel = f;
        mileage = m;
    }

    // Inner class
    class Details {
        void show() {
            System.out.println("Car Name: " + name);
            System.out.println("Fuel Type: " + fuel);
            System.out.println("Mileage: " + mileage + " km/l");
        }
    }
}

public class CarService {
    public static void main(String[] args) {

        Car c = new Car("Honda City", "Petrol", 18);

        // Creating object of inner class
        Car.Details details = c.new Details();
        details.show();

        // Anonymous class
        Service s = new Service() {
            void perform() {
                System.out.println(c.name + " is going for service.");
            }
        };

        s.perform();
    }
}

