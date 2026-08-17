class Vehicle {
    String vehicleNumber = "MH12AB1234";
    String vehicleType = "Car";

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Insurance extends Vehicle {
    String insuranceCompany = "ABC Insurance";

    void displayInsurance() {
        System.out.println("Insurance Company: " + insuranceCompany);

        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Type: " + super.vehicleType);

        super.displayVehicle();
    }
}
public class VehicleInsurance {
    public static void main(String[] args) {
        Insurance i = new Insurance();
        i.displayInsurance();
    }
    
}
