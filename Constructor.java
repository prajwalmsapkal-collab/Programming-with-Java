class Constructor{
    String name;
    int age;
    //DC
    Constructor(){
        name="praju";
        age=20;
    }
    //PC
    Constructor(String n, int r){
        name=n;
        age=r;
    //CC
    }
    Constructor(Constructor o){
        name=o.name;
        age=o.age;

    }
     
    void display(){
        System.out.println(name);
        System.out.println(age);

    }    

    public static void main(String[] args) {
        Constructor p=new Constructor();
        Constructor t=new Constructor("prajwal", 99);
        Constructor u=new Constructor (t);

        p.display();
        t.display();
        u.display();
    }
        
    }
