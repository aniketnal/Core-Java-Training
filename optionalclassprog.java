import java.util.Optional;
public class optionalclassprog {
    public static void main(String[] args){
        String s = "MET";

        Optional<String> checkNull = Optional.ofNullable(s);

        // so if something is there return true or else false
        System.out.println(checkNull.isPresent());
        System.out.println(checkNull.isEmpty());
        // returns the specified statement is null or else return the string
        System.out.println(checkNull.orElse("There is null"));
        
    }
}
