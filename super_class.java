class abc{
    int a = 10;
}

class efg extends abc{
    int a = 20;

    public void display(){
        System.out.println("a: " + a);
        System.out.println("a: " + super.a);
    }
}

public class super_class{
    public static void main(String[] args){
        efg e = new efg();
        e.display();
    }
}