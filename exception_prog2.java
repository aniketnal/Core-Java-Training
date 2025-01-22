public class exception_prog2 {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            // throws keyword is mainlyused for compile time exception and checekd exception
            throw new ArithmeticException("/ by zero krdiya na bhai");
        }

    }
}
