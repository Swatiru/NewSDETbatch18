package class15constructor;

public class Person {
    String name;
    int age;
    double weight;
    double salary;
    String favPLanguage;

    public Person (String pName,int pAge,double pWeight,double pSalary,String pFavPlan){

        name=pName;
        age=pAge;
        salary=pSalary;
        favPLanguage=pFavPlan;

    }
    public Person (String pName,int pAge,double pWeight) {

        name = pName;
        age = pAge;
        salary = pWeight;

    }
  public  void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
