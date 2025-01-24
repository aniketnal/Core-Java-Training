import java.util.Scanner;
public class secondLargest {
    public static void max( int arr[]){
        int max = 0;
        int secondMax = 0;
        for(int i = 0; i < 4; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("The second largest element is: " + secondMax);
    }

    public static void main(String[] args){
        int size = 4;
        
        int[] arr = new int[size];
        
        for(int i =0; i < 4; i++){
            System.out.print("Enter the element: ");
            Scanner sc = new Scanner(System.in);
            int element = sc.nextInt();
            sc.close();
            arr[i] = element;
        }
        max(arr);
        
    }
}
