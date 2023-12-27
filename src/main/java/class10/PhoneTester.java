package class10;

public class PhoneTester {
    public static void main(String[] args) {
// create an object from class
        Phone iphone=new Phone();
        iphone.model="15";
        iphone.color="blue";
        iphone.make="apple";
        iphone.price=1000;


        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.make);
        System.out.println(iphone.price);

        iphone.call();
        iphone.text();
        iphone.camera();

    }

}
