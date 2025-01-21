abstract class Car{
    abstract public void fuelType();

    public void color(){
        System.out.println("The color of the car is RED");
    }
}
class Tata extends Car{
    public void fuelType(){
        System.out.println("The fuel type of the car is PETROL");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Tata t = new Tata();
        t.fuelType();
        t.color();
    }
}