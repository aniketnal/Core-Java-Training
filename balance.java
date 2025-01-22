// import javax.naming.InsufficientResourcesException;

public class balance{
    static int balance = 1000;
    public void withdraw(int amount) throws Exception{
        if(amount > balance){
            throw new Exception("Insufficient balance");
        }else{
            System.out.println("Amount withdrawn: "+amount);
        }
    }

    public static void main(String args[]){
        balance obj = new balance();
        try{
            obj.withdraw(5000);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }finally{
            System.out.println("Finally block executed");
        }
    }
}
