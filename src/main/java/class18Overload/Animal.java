package class18Overload;

public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;
    Animal (String name,String color,int age, double weight) {
        this.name = name;
        this.color = color;
        this.age=age;
        this.weight=weight;
    }
   public void sleep(){
        System.out.println("zzzzzzzzzzz");
    }
   public void speak(){
        System.out.println("animal speaking");
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
class Dog extends Animal {
    public Dog(String name, String color, int age, double weight) {

        super(name, color, age, weight);
    }

    public void speak() {
        System.out.println("wff wuff");

    }

    void demo(String str) {
        printLen(str);
    }

    void printLen(String word) {
        System.out.println(word.length());
    }
}