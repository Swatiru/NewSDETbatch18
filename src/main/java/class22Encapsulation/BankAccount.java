package class22Encapsulation;

public class BankAccount {
    private double balance;
    private String userName;
    private String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }
    void login(){
        System.out.println("log in to bank account");
    }
    void transferFunds(){
        System.out.println("transfer funds");
    }
    void resetPassword(){
        System.out.println("resetting the password");

    }
    double getBalance(){//only see the data you cat not write
        return balance;
    }
    void setBalance(double balance){
        this.balance=balance;

    }
}
