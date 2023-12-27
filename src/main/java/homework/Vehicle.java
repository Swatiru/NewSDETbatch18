package homework;
/*create a class named Vehicle. If no arguments are passed while creating an object of the class,
it should print "I love vehicles". If a String representing the type of vehicle (like "Car", "Bike")
 is passed, it should print "I love [VehicleType]". For example, if "Car" is passed, it should print "I love Car"
 */
public class Vehicle {
    String VehicleType;
    public  Vehicle (){
        System.out.println("I love vehicle " );
    }
    public  Vehicle (String VehicleType){
        this.VehicleType=VehicleType;
        System.out.println("I love " +VehicleType);
    }
}

