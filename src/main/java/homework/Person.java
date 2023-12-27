package homework;
/* Write program: User that has a constructor that initializes instance variable name and mobile number.
Create a subclass/child class  userInfo that will have user address variable and it also being
initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
 */
public class Person {
   private String name;
    private String mobNo;
 public void PersonDetails(){
     System.out.println(name+" "+mobNo);
 }
 public Person(String name,String mobNo) {
        this.name = name;
        this.mobNo = mobNo;
    }
}
class PersonInfo extends Person{
    private String address;
    public PersonInfo(String name, String mobNo, String address) {
        super(name, mobNo);
        this.address = address;
    }
    public void PersonDetails(){
        super.PersonDetails();
        System.out.println(address);
    }
}