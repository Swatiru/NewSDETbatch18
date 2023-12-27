package class14;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee e=new SyntaxEmployee();
        e.empId=01;
        e.salary=70000;
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(e.empId);
        System.out.println(e.salary);
        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empId=02;
        e2.salary=70000;
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(e.empId);
        System.out.println(e.salary);
    }
}

