package class24HashMap;
/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.*/
public class Person {
    private String name;
    private String LastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        LastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println(name+" "+LastName+" "+age+" "+salary);

    }
}
