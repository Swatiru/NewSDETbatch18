package class16inheritance;

public class AnimalTester {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "jaxy";
        d.color = "brown";
        d.age = 10;
        d.weight = 4.6;
        d.printInfo();
        d.bark();
        d.sleep();

    Cat c= new Cat();
    c.name="rro";
    c.color="white";
    c.age=4;
    c.weight=2.4;
    c.printInfo();
    c.sleep();
    c.speak();


    }
}
