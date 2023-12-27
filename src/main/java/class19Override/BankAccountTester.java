package class19Override;

public class BankAccountTester {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount("SK3456",800000,"ria",300);
        s.printinfo();
        s.withdraw(21000,20000);
        s.deposit(200,5000);
        s.initBalance(300);
        System.out.println();
        CheckingAccount c=new CheckingAccount("we3456",890000,"john");
        c.printinfo();
        c.withdraw(11000,20000);
        c.deposit(200,100);
        System.out.println();
        FixeDeposit f=new FixeDeposit("aw23457",9000000,"jacob");
        f.printinfo();
        f.withdraw(21200,20000);
        f.deposit(200,4000);
    }
    }



