package class14;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="swati";
        p1.age=31;
        p1.weight=60;
        p1.printInfo();
        System.out.println(Person.noOfEye);


        Person p2=new Person();

        p2.name="abhi";
        p2.age=31;
        p2.weight=68;
        p2.printInfo();
        System.out.println(Person.noOfEye);

    }
}
