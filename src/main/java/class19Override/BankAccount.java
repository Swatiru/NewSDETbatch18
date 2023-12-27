package class19;
/*2)Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount,
and FixedDepositAccount.
Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.

*/
public class BankAccount {
    private String accountNo;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNo, double balance, String accountHolder) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void printinfo() {

        System.out.println(accountNo + " " + balance + " " + accountHolder);
    }

    public void withdraw(double wiDraw, double limit) {
        if (wiDraw <= limit) {
            System.out.println("you can withdraw money " + wiDraw + " in one day limit is " + limit);
        } else {
            System.out.println("You can not withdraw money amount is more than the limit "+limit);
        }
    }

    public void deposit(double minAmount, double depositAmo) {
        if (depositAmo >= minAmount) {
            System.out.println("you can deposit amount " + depositAmo + " amount should be more than basic amount " + minAmount);
        } else {
            System.out.println("you can not deposit lower than the " + minAmount + " amount");
        }
    }
}
    class SavingAccount extends BankAccount {
        private double initBalance;
        public SavingAccount(String accountNo, double balance, String accountHolder, double initBalance) {
            super(accountNo, balance, accountHolder);
            this.initBalance = initBalance;
        }
         public void initBalance(int initBalance){
            System.out.println("saving account must start with basic amount " + initBalance);
        }

        @Override
        public void withdraw(double wiDraw, double limit) {
            super.withdraw(wiDraw, limit);
        }

        @Override
        public void deposit(double minAmount, double depositAmo) {
            super.deposit(minAmount, depositAmo);
        }
    }

    class CheckingAccount extends BankAccount {
        public CheckingAccount(String accountNo, double balance, String accountHolder) {
            super(accountNo, balance, accountHolder);
        }

        @Override
        public void withdraw(double wiDraw, double limit) {
            super.withdraw(wiDraw, limit);
        }

        @Override
        public void deposit(double minAmount, double depositAmo) {
            super.deposit(minAmount, depositAmo);
        }

        public void accountNo() {
            System.out.println("account no should be same");
        }}

        class FixeDeposit extends BankAccount {
            public FixeDeposit(String accountNo, double balance, String accountHolder) {
                super(accountNo, balance, accountHolder);
            }

            @Override
            public void withdraw(double wiDraw, double limit) {
                super.withdraw(wiDraw, limit);
            }

            @Override
            public void deposit(double minAmount, double depositAmo) {
                super.deposit(minAmount, depositAmo);
            }
        }





