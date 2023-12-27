package class14;

public class Student {
    static int studentNo;
    String name;
    int studentId;



    public static void main(String[] args) {
      Student s=new Student();
      s.name="swati";
      s.studentId=12;
        System.out.println(Student.studentNo++);
        System.out.println(s.name);
        System.out.println(s.studentId);
        Student s2=new Student();
        s2.name="ria";
        s2.studentId=13;
        System.out.println(Student.studentNo++);
        System.out.println(s2.name);
        System.out.println(s2.studentId);
    }

    }