package class15constructor;
//write java class students that have a constructor which takes students name and 3 subject grades
//inside your class also have a method to calculate Average grade. test student class for 2 different marks.
//your program should print an average mark of each student name.
//Note please use different names for instance and local variables.
public class Student {
    String name;
    double englishMark;
    double mathMark;
    double javaMark;

    Student(String pName,double pEnglishmark,double pMathMark,double pJavamark) {
        name=pName;
        englishMark=pEnglishmark;
        mathMark=pMathMark;
        javaMark=pJavamark;
    }
    public  void printInfo(){
        double printInfo=(englishMark+mathMark+javaMark)/3;
        System.out.println(printInfo);
    }
}

