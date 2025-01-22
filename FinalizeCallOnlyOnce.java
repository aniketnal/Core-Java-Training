public class FinalizeCallOnlyOnce {
    static FinalizeCallOnlyOnce s;
    public static void main(String[] args){
        FinalizeCallOnlyOnce f = new FinalizeCallOnlyOnce();
        // first the hascode is printed
        System.out.println("Hascode of f: " + f.hashCode());
        // initialize the object to null
        f = null;
        // flush it out, the call goes to finalize method
        System.gc();
        // third this block of try an catch is executed and the thread sleeps for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // fourth, after 2 seconds, the object is assigned to s and below line is printed
        System.out.println("Hascode of s: " + s.hashCode());
        // here s will have the same hashcode as f
        s = null;
        // flush it out again, but this time the finalize mathod not called as they have the same hashcode and the object is not garbage collected
        System.gc();
        // five, the thread sleeps for 4 seconds and then the below line is printed
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // at last the main is ended
        System.out.println("End of main!");
    }
    // second, control goes here and the object is assigned to s
    public void finalize(){
        System.out.println("finalize method called");
        s = this;
    }
}
