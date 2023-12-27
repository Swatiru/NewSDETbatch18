package class17SuperKeyWord;
//Create 1 class with a static method that has 3 overloaded forms.
        //Then call each overloaded method with specific arguments and observe result.
public class StaticOverloaded {
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }static void add(double num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,int num2 ,int num3){
        System.out.println(num1+num2+num3);
    }
    public static void main(String[] args) {
        add(10,18);
        add(10.6,20.5);
        add(20.3,4,20);

    }
}
