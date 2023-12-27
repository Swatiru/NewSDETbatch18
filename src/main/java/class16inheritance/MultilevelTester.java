package class16inheritance;

public class MultilevelTester {
    public static void main(String[] args) {
        Audi a=new Audi();
       String b=a.color;
        boolean b1=a.badEngines;
        int b2=a.noOfDoors;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);

    }

}
class Vehicle{
String color="black";
}
class Car extends Vehicle{
int noOfDoors=4;
}
class Audi extends Car{
    boolean badEngines=true;

}