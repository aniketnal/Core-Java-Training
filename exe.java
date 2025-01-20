class MET {
    int add (int a, int b) {
        return a + b; 
    }
    int mod (int a, int b){
        return a % b;
    }
}

public class exe{
    public static void main(String[] args) {
        MET m = new MET();
        System.out.println(m.add(20,2));
        System.out.println(m.mod(20,2));
    }
}
