package class21Abstraction;

public abstract class Task3 {
    private String make;
    private String model;
    private double fuelLevel;

    public Task3(String make, String model, double fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();

}
class Car extends Task3{
    public Car(String make, String model, double fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("car is started");
    }

    @Override
    public void stopEngine() {
        System.out.println("car is stopped");
    }

    @Override
    public void fuelUp() {
        System.out.println("car fuel is down ");
    }
}
class MotorCycle extends Task3 {
    public MotorCycle(String make, String model, double fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("MotorCycle is started very quickly");
    }

    @Override
    public void stopEngine() {
        System.out.println("after putting a break MotorCycle stopped");
    }
    @Override

    public void fuelUp() {
        System.out.println("MotorCycle fuelLevel is fine");
    }
}
class Truck extends Task3{
    public Truck(String make, String model, double fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("truck is stared");
    }
    @Override
    public void stopEngine() {
        System.out.println("truck is stopped");
    }

    @Override
    public void fuelUp() {
        System.out.println("truck takes more fuel");
    }
}