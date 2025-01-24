import java.util.ArrayList;

public class lambdaexp {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // lambda expression for printing arraylist elements
        arr.forEach((n)->{System.out.println(n);});
    }
}
