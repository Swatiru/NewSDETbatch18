package class22Encapsulation;

public class BankaccountTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(3000,"swati"," sw123");
        System.out.println(b.getBalance());
        b.setBalance(25000);
        System.out.println(b.getBalance());
    }
}
