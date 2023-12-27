package class21Abstraction;

public abstract class Animal {
    public abstract void eat();

    void sleep() {
        System.out.println("animal sleep");
    }

    public abstract void speak();

}
class Dog extends Animal{
    public void eat(){
        System.out.println("dog likes to eat meat");
    }
    public void speak(){
        System.out.println("wuuff, wuff");
}}
class Cat extends Animal{
    public void eat(){
   System.out.println("dog likes to eat fish");
}
public void speak(){
    System.out.println("meow meow");
}
}

