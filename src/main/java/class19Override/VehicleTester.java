package class19Override;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(60,"black","petrol");
        Car c=new Car(70,"pink","electric",4);
        Truck t=new Truck(40,"red","diesel",14);
        MotorCycle m=new MotorCycle(80,"green","petrol");
        Bicycle b=new Bicycle(20,"black","no-fuel");
      Vehicle[] v1={v,c,t,m,b};
        for (int i = 0; i<v1.length ; i++) {
            Vehicle v2=v1[i];
            v2.printInfo();
            v2.accelerate();
            v2.brake();

        }
    }
}