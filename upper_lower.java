import java.util.Arrays;
public class upper_lower{
    public static void main(String[] args){
        String str = "dsadsda";
        char[] c = str.toCharArray();
        int upper = 0;
        int lower = 0;

        for(int i = 0; i < c.length; i++){
            if(c[i] >= 65 && c[i] <= 90){
                upper++;
            }
            else if(c[i] >= 97 && c[i] <= 122){
                lower++;
            }
        }
        if(upper >0 && lower > 0){
            System.out.println("The string contains both upper and lower case letters");
        }
        else if(upper > 0){
            System.out.println("The string contains only upper case letters");
        }
        else if(lower > 0){
            System.out.println("The string contains only lower case letters");

        }
        else{
            System.out.println("The string does not contain both upper and lower case letters");
        }
    }
}