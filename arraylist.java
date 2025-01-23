// import java.util.ArrayList;
// import java.util.Vector;
// import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class arraylist {
    public static void main(String[] args){
        // deafault parameter of the arraylist in java id object but it is a good sractice to specify it as it avoids type issue (runtime error)
        // ArrayList<Object> arr = new ArrayList<>();
        // arr.add("moyan");
        // arr.add(2);
        // arr.add(3.14);
        // arr.add(4.2f);
        // arr.add(true);
        // Vector<Integer> arr = new Vector<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);

        // for(int i = 0; i < arr.size(); i++){
        //     System.out.println(arr.get(i));

        // }

        // LinkedHashSet<Integer> arr = new LinkedHashSet<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(4);

        // for (Integer num : arr) {
        //     System.out.println(num);
        // }
        
        SortedSet<Integer> arr = new TreeSet<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(4);

        for (Integer num : arr) {
            System.out.println(num);
        }

    }
    
}
