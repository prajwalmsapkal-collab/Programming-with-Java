class phone{
    String model;
    double Price;

    public phone(){
        model="samsung galaxy";
        Price=999;
    }
    
    public phone(String phonemodel ,double phoneprice ){
        model=phonemodel;
        Price=phoneprice;
    }

    public phone(phone c){
        model=c.model;
        Price=c.Price;

    }

    public void display(){
        System.out.println("phone model:" + model);
        System.out.println("phone price:" + Price);
    }
}

public class MobileInventory{
    public static void main(String[] args) {
        // Object using Default Constructor

        phone n =new phone();

        // Object using Parameterized Constructor
        phone n1=new phone("iphone 17" , 799);
        phone n2=new phone("nothing phone" , 499);

        // Object using Copy Constructor
        phone n3=new phone(n1);


        System.out.println("Current Inventory:");
        n.display();
        n1.display();
        n2.display();
        n3.display();
    }
}