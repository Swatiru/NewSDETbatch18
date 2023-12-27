package class18Overload;

public class person {
    private String name;
    private int age;
    private double weight;

    public person( String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class Student extends person{
    private double marks;//instance field of same class
    public Student(String sName, int sAge, double sWeight,double marks){
        super(sName,sAge,sWeight);//theis fields store the value for parent class field
        this.marks=marks;
    }
    public void printMarks(){

        System.out.println(marks);
    }
    public void printInfo(){//override printInfo method from
        super.printInfo();//parent class for redefiend
        System.out.println(marks);
    }
}

