
public class stringplay{
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("software");
        StringBuffer str1 =  new StringBuffer(" developer");
        // str.concate(str1); // This method does not exist
        str.append(str1);
        System.out.println(str);

        // String firstName = "Pratik";
        // String lastName = " Shinde";

        // System.out.println(firstName.concat(lastName));
    }
}