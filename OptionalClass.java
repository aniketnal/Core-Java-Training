import java.util.Optional;
public class OptionalClass {
    

    public static void main(String[] args){
    //     String s = "";

    //     Optional<String> checkNull = Optional.ofNullable(s);

    //     // so if something is there return true or else false
    //     System.out.println(checkNull.isPresent());
    //     System.out.println(checkNull.isEmpty());
    //     // returns the specified statement is null or else return the string
    //     System.out.println((checkNull.orElse("Null hai bhai")));
        // String s = null;
        Optional<String> str = getName();
        System.out.println(str.orElse("null hai bhai"));
        
    }

    public static Optional<String>getName(){
        String s = "Oh maa mataji";
        // method returns tru if null or string to main object
        return Optional.ofNullable(s);
    }
}
