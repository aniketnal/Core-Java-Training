@FunctionalInterface
interface A {
    public abstract void sum(int a, int b);

    default void show(){
        System.out.println("Default method");
    }
}

public class interfaceannotation{
    public static void main(String[] args){
        A obj = (a, b) -> System.out.println(a+b);
        obj.sum(5,10);
        obj.show();
    }
}
