package class17;
class Math{
    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1, int num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2 ,int num3){

        System.out.println(num1+num2+num3);
    }
    static void add(int num1, double num2){

        System.out.println(num1+num2);
    }

}

public class E1MethodOverloading {
    public static void main(String[] args) {
Math.add(10,20);
Math.add(15.3,20);
Math.add(10.,7.50,20);
    }

}
