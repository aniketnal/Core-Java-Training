interface myClass {
    public static void sayHello(){
        System.out.println("Hello");
    }
}

public class S_method implements myClass{
    public static void main(String[] args){
        // can't be called using obeject
        // S_method s = new S_method();
        // s.sayHello();

        //can't be accessed using child class name
        // S_method.sayHello();
        
        // can only be accesed with the interface's name
        myClass.sayHello();
    } 
}