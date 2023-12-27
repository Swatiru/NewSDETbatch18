package class14;

public class Cat {
    String name="kitti";//instance variable
    void printName(){
        //local variable
        String name="pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
