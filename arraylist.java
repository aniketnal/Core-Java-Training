import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        // deafault parameter of the arraylist in java id object but it is a good sractice to specify it as it avoids type issue (runtime error)
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("mohit");
        arr.add('a');
        arr.add(100);
        arr.add(true);
        arr.add(10.2f);

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));

        }

    }
}
