public class exception_prog{
    int a = 10; 
    int b = 0;

    public static void main(String[] args){
        exception_prog obj = new exception_prog();
        try{
            int c = obj.a/obj.b;
            System.out.println("Result: "+c);
        }catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }catch(Exception f){
            System.out.println(f.getMessage());
        }
        // error : finally without try
        // System.out.println("Rest of the code");
        finally{
            System.out.println("Finally block executed");
        }

        // this is allowed cause it is not mandatory to have catch block
        // try{
        //     int c = obj.a/obj.b;
        //     System.out.println("Result: "+c);
        // }finally{
        //     System.out.println("Finally block executed");
        // }
        
    }
}