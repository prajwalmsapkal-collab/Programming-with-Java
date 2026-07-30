class Employee{
    String name;
    int id;
    double salary;

    Employee(String n , int i , double s){
        name=n;
        id=i;
        salary=s;
    }

    void displayDetails(){
        System.out.println("Employee name:" + name);
        System.out.println("Employee id:" + id);
        System.out.println("Employee salary:" + salary);
    }

    void calculatebonus(){
        double bonus = salary * 0.10;
        System.out.println("Bonus: " + bonus);
    }
}

public class Imple {
    public static void main(String[] args) {
        int companyCode= 103;
        String department="Computer science";

        Employee e = new Employee("Prajwal", 1 ,50000);

         System.out.println("Company Code: " + companyCode);
        System.out.println("Department: " + department);

        e.displayDetails();
        e.calculatebonus();
    }
    
}
