// public class threads extends Thread {
//     // this needs to be overriden, else nothing happens when the thread is started
//     @Override
//     // yeh method runnable ki hai aur runnbale ek interface hai isiliye it is by deafault available in thread class
//     public void run(){
//         for(int i=0; i<3; i++){
//             System.out.println(Thread.currentThread().getPriority()+ " Value "+i);
//         }
//         int num = 10;
//         System.out.println(num + 10);
//         System.out.println(num - 5);
//         System.out.println("------------------------------------------------");

//         for(int i = 0; i < 10; i++){
//             System.out.println(5*i);
//         }
//     }
//     public static void main(String[] args){
//         threads t1 = new threads();
//         // threads t2 = new threads();
//         System.out.println("Minimum priority of a thread: " + Thread.MIN_PRIORITY);
//         System.out.println("Normal priority of a thread: " + Thread.NORM_PRIORITY);
//         System.out.println("Mamximun priority of a thread: " + Thread.MAX_PRIORITY);
//         t1.setPriority(1);
//         t1.start();
//         // t2.setPriority(2);
//         // t2.start();      
//     }
// }

public class Innerthreads implements Runnable {
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName()+ " Value "+i);
        }
        int num = 10;
        System.out.println(num + 10);
        System.out.println(num - 5);
        System.out.println("------------------------------------------------");

        for(int i = 0; i < 10; i++){
            System.out.println(5*i);
        }
    }

    public static void main(String[] args) {
        Innerthreads it = new Innerthreads();
        Thread t1 = new Thread(it);
        t1.setName("Babu");
        Thread t2 = new Thread(it);
        t2.setName("Shona");
        System.out.println("Minimum priority of a thread: " + Thread.MIN_PRIORITY);
        System.out.println("Normal priority of a thread: " + Thread.NORM_PRIORITY);
        System.out.println("Mamximun priority of a thread: " + Thread.MAX_PRIORITY);
        t1.setPriority(5);
        t1.start();
        t2.setPriority(2);
        t2.start();
    }
    
}
