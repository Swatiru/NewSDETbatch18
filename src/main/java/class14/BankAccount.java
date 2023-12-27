package class14;

public class BankAccount {
    String accountNo;
    double balance;
    String Username="user123";
   private String password="pass123";

   private void printInfo(){

       System.out.println(accountNo);
   }

    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        System.out.println(a.password);
        a.printInfo();
    }
}
