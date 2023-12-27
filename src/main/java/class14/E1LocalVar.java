package class14;

public class E1LocalVar {
    public static void main(String[] args) {
        int age=10;
        if(5<10){// inside of lop you can access
          String name="jerry";
        }

    if(10>5){
       // System.out.println(name);outside
        System.out.println(age);//inside
    }
   // void printAge(){
        //System.out.println(age);//out side of bracket can not access
        //System.out.println(name);//out side of brcket
    }

}
