package class10;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="swati";
        p1.race="asian";
        p1.height=6.1;
        p1.weight=126;
        System.out.println(p1.name);
        System.out.println(p1.race);
        System.out.println(p1.height);
        System.out.println(p1.weight);
        p1.run();
        p1.speak();
        p1.eat();

    }
}
