// import java.util.List;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = arr.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }

}
