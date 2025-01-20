import java.util.Scanner;

class MET {
    int add (int a, int b) {
        return a + b; 
    }
    int mod (int a, int b){
        return a % b;
    }
}

public class exe{
    public static void main(String[] args) {
        MET m = new MET();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println(m.add(a,b));
        System.out.println(m.mod(a,b));
    }
}
