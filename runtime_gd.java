import java.util.Date;

public class runtime_gd{
    
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        // r = null;
        // System.gc();
        for(int i=0; i<1000000; i++){
            Date d = new Date();
            d = null;

        }
        System.out.println(r.freeMemory());
        r.gc();
        System.out.println(r.freeMemory());
        // System.out.println("Main method hu");
    }
}
