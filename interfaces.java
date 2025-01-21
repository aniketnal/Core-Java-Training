import java.util.Scanner;
interface client{
    public void input();
    public void output();
}
public class interfaces implements client {
    String name;
    int salary;
    public void input(){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter your salary: ");
        Scanner sc1 = new Scanner(System.in);   
        salary = sc1.nextInt();
        sc.close();
        sc1.close();

    }

    public void output(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args){
        client c= new interfaces();
        c.input();
        c.output();
    }
}


