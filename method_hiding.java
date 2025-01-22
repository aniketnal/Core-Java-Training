class P{
    public static void display(){
        System.out.println("Parent");
    }
}

class Q extends P{
    public static void display(){
        System.out.println("Child");
    }
}

public class method_hiding {
    public static void main(String[] args){
        // P.display();
        Q.display();
    }
}
