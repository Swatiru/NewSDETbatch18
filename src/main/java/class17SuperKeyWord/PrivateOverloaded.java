package class17SuperKeyWord;
//Create 1 class with a private method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.
public class PrivateOverloaded {
    private  void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    private  void add(double num1, double num2){
        System.out.println(num1+num2);
    }
    private  void add(double num1,int num2 ,int num3){
        System.out.println(num1+num2+num3);
    }

    public static void main(String[] args) {
        PrivateOverloaded num=new PrivateOverloaded();
        num.add(10,18);
        num.add(10.6,20.5);
        num.add(20.3,4,20);

    }
}



