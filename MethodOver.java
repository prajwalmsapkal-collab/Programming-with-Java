 class Calcu{
    static int count=0;
    void add(int a , int b){
        int sum=a+b;
        count++;

        System.out.println("Addition of two numbers: " + sum); 
    }
    void add(double a , double b){
        double sum=a+b;
        count++;
        System.out.println("Adition of two decimal numbers :" + sum);
    }
    void add(int a , int b, int c){
        int sum=a+b+c;
        count++;
        System.out.println("Adition of three integers:" + sum);
    }

    static void display(){
         System.out.println("total calculation performed: " + count);
        
    }
    
}

public class MethodOver{
    public static void main(String[] args) {
        Calcu n =new Calcu();
        n.add(2,3);
        n.add(13.5, 16.23);
        n.add(1, 2, 87);      
        Calcu.display();
    }

}