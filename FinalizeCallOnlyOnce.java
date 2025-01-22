public class FinalizeCallOnlyOnce {
    static FinalizeCallOnlyOnce s;
    public static void main(String[] args){
        FinalizeCallOnlyOnce f = new FinalizeCallOnlyOnce();
        System.out.println("Hascode of f: " + f.hashCode());
        f = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hascode of s: " + s.hashCode());
        s = null;
        System.gc();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main!");
    }

    public void finalize(){
        System.out.println("finalize method called");
        s = this;
    }
}
