package class15constructor;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private double salary;

    private Cat(String name, int age, double weight, double salary) {

       this.name = name;
        this.age = age;
        this.weight=weight;
        this.salary = salary;

    }

    public  void printInfo(){
        System.out.println(name+" "+age+" "+weight+" "+salary);
    }

    public static void main(String[] args) {
        Cat c=new Cat("swati",30,60,8000);
        c.printInfo();
    }
}

