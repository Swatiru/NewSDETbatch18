package homework;

public class CarTester {
    public static void main(String[] args) {
        Car c=new Car("sedans","bmw",2019);
        c.printInfo();
        c.rentalPrice(5,20);
        System.out.println();
        LuxuryCar l=new LuxuryCar("tesla","modX",2022);
        l.printInfo();
        l.rentalPrice(4,50,100);
        System.out.println();
        EconomyCar e=new EconomyCar("toyota","camry",2018);
        e.printInfo();
        e.rentalPrice(6,20);
        System.out.println();


    }
}
