package class19Override;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define 3 common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class Student {

    void homework() {
        System.out.println("honework");
    }

    void exam() {
        System.out.println("exam");
    }

    void study() {
        System.out.println("study study");
    }
}
class SyntaxStudents extends Student{
    void play() {
        System.out.println("Student likes to play cards");
    }
}

class CollegeStudent extends Student{
    void exam() {
        System.out.println("exam");
    }
}
class SchoolStudent extends Student{
    void homework() {
        System.out.println("chilling instead of doing homework)))");
    }

}