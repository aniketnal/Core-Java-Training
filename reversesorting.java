import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2){
        return i1.compareTo(i2);
    }
}
public class reversesorting{
    public static void main(String[] args){
        TreeSet<Integer> arr = new TreeSet<>(new myComparator());
        arr.add(20);
        arr.add(3);
        arr.add(1);
        arr.add(9);
        arr.add(100);

        System.out.println(arr);
    }
}