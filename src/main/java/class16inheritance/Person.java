package class16inheritance;

public class Person {
    String name;
    int age;
    double weight;

void printInfo() {
    System.out.println(name + " " + age + " " + weight);

}
}
class Student extends Person{
    char grade;
    void study() {
    }
}
    class StudentTester {
        public static void main(String[] args) {
            Student s = new Student();
            s.name="swati";
            s.age = 12;
            s.weight=60;

            s.printInfo();

        }
    }






