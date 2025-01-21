public class static_class{
    static class inner{
        public void method(){
            System.out.println("Inner class method");
        }        
    }

    public static void main(String[] args){
        inner i = new inner();
        i.method();
    }
}