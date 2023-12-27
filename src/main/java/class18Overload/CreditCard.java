package class18Overload;
/*create a class CreditCard create an instance method that will calculate interest based on given balance.
* Create 2 subclasses: Visa and AX.in AX class override method calculate interest. call the method by crating
* an object of each of the three classes*/

public class CreditCard {
    void  calculateInterest(double amount){
        double interest=amount*0.5;
        System.out.println("Interest on"+ amount+" is "+interest);
    }
}
class Visa extends CreditCard{
    @Override
    void calculateInterest(double amount) {
        double interest=amount*0.07;
        System.out.println("Interest on"+ amount+" is "+interest);
    }
}
class AX extends CreditCard{
    @Override
    void calculateInterest(double amount) {
        double interest=amount*0.09;
        System.out.println("Interest on "+ amount+" is "+interest);
    }
}
class CreditcardTester{
    public static void main(String[] args) {
        AX ax=new AX();
        ax.calculateInterest(100);
        Visa v =new Visa();
        v.calculateInterest(100);
    }
}
