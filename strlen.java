@FunctionalInterface
interface A{
    // public abstract void lenfunc(String s);
    public abstract void mod(int a, int b);
}

public class strlen {
    public static void main(String[] args){
        // String s = "Hello";
        // A obj = (s) -> System.out.println(s.length());
        // cannot declare these variable (just java things)
        // int a = 11;
        // int b = 10;
        A obj = (a,b) -> System.out.println(a%b);
        obj.mod(11,10);
    }
}
