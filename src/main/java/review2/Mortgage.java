package review2;

public class Mortgage {
    public static void main(String[] args) {
        double rate=5.0;
        int price=300000;
        if(rate>4.5) {
            System.out.println("user will not buy house");
        }else{
            System.out.println(("user will consider buying"));
        }if (price>1000000){
            System.out.println("user will take a loan, otherwise user will pay cash");
        }else{
            System.out.println("user will pay cash");
        }

    }
}
