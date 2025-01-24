// Runnbale, Thread using lambda functions
public class run1 implements Runnable{
    @Override
    public void run() {
        // Implementation of the run method
    }
    public static void main(String[] args){
        // Runnable run = () -> System.out.println("Hello");
        Runnable run = () -> {for(int i =1; i<=10; i++){
            System.out.println(5*i);
        }};
        Thread t1 = new Thread(run);

        t1.start();
    }
}
