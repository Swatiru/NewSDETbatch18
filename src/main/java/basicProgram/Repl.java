package basicProgram;
//Create a variable that will hold the count of all instances of the Main class
//
//Create 3 Object of the class and print value of the count variable;
public class Repl {

    String name;
    int id;
    static int noOfStudents;
    public static void main(String[] args) {
        Repl st1=new Repl();
        st1.name = "Ahmed";
        st1.id=01;
        Repl.noOfStudents++;

        Repl st2=new Repl();
        st2.name = "ria";
        st2.id=02;
        Repl.noOfStudents++;

        Repl st3=new Repl();
        st3.name = "john";
        st3.id=03;
        Repl.noOfStudents++;

        System.out.println(noOfStudents);
    }}





