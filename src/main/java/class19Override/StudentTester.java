package class19Override;

public class StudentTester {
    public static void main(String[] args) {
        Student[] arr = {new Student(), new SyntaxStudents(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].homework();
            arr[i].exam();
            arr[i].study();
          /* if(Student instanceof SyntaxStudents ){
                SyntaxStudents s=  (SyntaxStudents)Student;
                s.play();*/
        }
    }}

