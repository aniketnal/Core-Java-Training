import java.util.Scanner;

public class Multiples {
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7,8,9,10};

        int user;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        user = sc.nextInt();

        for(int i = 0; i<10; i++){
            System.out.println(user + " x " + num[i] + " = " + user * num[i]);
        }

    }
}
