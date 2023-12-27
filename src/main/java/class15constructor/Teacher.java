package class15constructor;
//Write a Teacher class   that have instance variables name and address.
// Create a constructor that will initialize those variables.
// Print name & address of given  Teacher using displayInfo method.
public class Teacher {
    private String name;
    private String address;

    private Teacher(String name, String address) {

        this.name = name;
        this.address = address;


}
    public  void printInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Teacher c=new Teacher("swati","97, brookview");
        c.printInfo();
    }
}

