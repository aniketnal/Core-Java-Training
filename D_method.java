interface ABC {
    default public void m1(){
        System.out.println("This is display method of ABC");
    }

}
interface DEF {
    default public void m1(){
        System.out.println("This is display method of DEF");
    }

}

public class D_method implements ABC, DEF{
    public void m1(){
        DEF.super.m1();
    }

    public static void main(String[] args){
        D_method d = new D_method();
        d.m1();
        
    }
}
