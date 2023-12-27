package class10;

public class CarTester {
    public static void main(String[] args) {
// create an object from class
        Car bmw=new Car();
        bmw.model="I8";
        bmw.color="blue";
        bmw.make="bmw";
        bmw.price=120000;
        bmw.drive();
        bmw.honk();
        bmw.ApplyBrakes();
    }
}

