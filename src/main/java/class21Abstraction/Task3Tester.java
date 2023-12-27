package class21Abstraction;

public class Task3Tester {
    public static void main(String[] args) {
        Task3[] v={new Car("bmw","bm7",34.0),
        new MotorCycle("royal","mk16",34),
        new Truck("ford","fy34",60.9)};
        for(Task3 t:v){
            t.startEngine();
            t.stopEngine();
            t.fuelUp();
            System.out.println("-----------");
        }
    }

}