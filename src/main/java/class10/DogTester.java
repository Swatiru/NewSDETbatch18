package class10;

public class DogTester {
    public static void main(String[] args) {
        //creating an object of the class
   Dog dog1=new Dog();
   /*Dog=> data type
   dog1=>is a variable that holds
    */
        dog1.name="jacky";
        dog1.breed="german";
        dog1.weight=15;
        dog1.color="black";
        dog1.age=5;

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.color);
        System.out.println(dog1.age);

        dog1.bark();
        dog1.bark();

        Dog dog2=new Dog();
        dog2.name="Leo";
        dog2.breed="persian";
        dog2.weight=8;
        dog2.color="white";
        dog2.age=14;

        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        dog2.eat();
        dog2.sleep();
    }
}
