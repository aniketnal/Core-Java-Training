public class Palindrome {
    public static void main(String[] args) {
        String s = "mam";

        String reverseString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString += s.charAt(i);
        }

        if (s.equals(reverseString)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}