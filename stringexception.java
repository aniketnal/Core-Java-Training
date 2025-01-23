// public class stringexception{
//     public static void main(String[] args){
//         String s = "mohit";
//         System.out.println(s.charAt(3));
//         try{
//             System.out.println(s.charAt(30));
//         }catch(StringIndexOutOfBoundsException e){
//             System.out.println("String index out of bounds exception");
//         }
//     }
// }

public class stringexception {
    public static void main(String[] args) {
        stringexception obj = new stringexception();
        obj.equals("patil");
    }

    public boolean equals(Object obj) {
        String s = "moyan";
        System.out.println(s.equals(obj));
        return s.equals(obj);
    }
}
