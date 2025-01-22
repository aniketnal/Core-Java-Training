

public class finalize_method {
    public static void main(String[] args){
        finalize_method f = new finalize_method();
        finalize_method f1 = new finalize_method();
        System.out.println(f);
        System.out.println(f1);
        f = null;
        f1 = null;
        System.gc();
        System.out.println("Main method hu");
    }
    @Deprecated
    public void finalize(){
        System.out.println("finalize called");
    }
    
}
