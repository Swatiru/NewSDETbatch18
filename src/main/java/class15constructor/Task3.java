package class15constructor;

public class Task3 {
    String name;
    int age;
    double weight;
    double salary;


    public Task3(String name, int age, double weight) {
        this.name = name;
        this.age = age;

    }
    public Task3(String name, int age, double weight, double salary) {
        this(name,age,weight);
        this.salary=salary;
    }


    void printInfo(){
        System.out.println(name+" "+weight);
    }
}
