package class22Encapsulation;

public class MathTester {
    public static void main(String[] args) {
        //Calculator m=new Math();
        //we can not create the object of interfaces
        //Calculator c= new Calculator
        Math m=new Math();
        int r=m.add(10,10);
        System.out.println(r);
    }
}
