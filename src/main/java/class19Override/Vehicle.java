package class19Override;
/*Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car, Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array. Iterate through the array to demonstrate polymorphism.

*/
public class Vehicle {
  private double speed;
  private String color;
  private String fuelType;

    public Vehicle(double speed, String color, String fuelType) {
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }
    public void accelerate() {
        System.out.println("when accelerate vehicle go fast");
    }
    public void brake() {
        System.out.println("when brake vehicle stop");
    }

    public void printInfo(){
            System.out.println(speed+" "+color+" "+fuelType);
    }
    }
    class Car extends Vehicle{
    public Car(double speed, String color, String fuelType, int carDoor) {
        super(speed, color, fuelType);
    }
    public void accelerate() {
        super.accelerate();
    }

         @Override
         public void brake() {
             super.brake();
         }
         public void fuelLevel(){
             System.out.println("fuelLevel sensor show fuel Level");
     }}
    class Truck extends Vehicle{
    private double loadCargo;
      public Truck(double speed, String color, String fuelType, double loadCargo) {
            super(speed, color, fuelType);
            this.loadCargo = loadCargo;
        }
        public void loadCargo() {
            System.out.println("truck can carry lots of cargo");
        }
        @Override
        public void accelerate() {
            System.out.println("truck wth cargo weight"+ loadCargo);
        }
        @Override
        public void brake() {
            System.out.println("loaded truck should take a brake slowly");
        }}
        class MotorCycle extends Vehicle{
        public MotorCycle(double speed, String color, String fuelType) {
             super(speed, color, fuelType);
         }
         @Override
         public void accelerate() {
             System.out.println("motorcycle accelerate quickly");
         }
         @Override
         public void brake() {
             System.out.println("motorcycle breaks works fast");
         }}
        class Bicycle extends Vehicle{
            public Bicycle(double speed, String color, String fuelType) {
                super(speed, color, fuelType);
            }
            @Override
            public void accelerate() {
                System.out.println("bicycle accelerate slow");
            }

            @Override
            public void brake() {
                System.out.println("bicycle have automatic breaks for slope");
            }
        }
