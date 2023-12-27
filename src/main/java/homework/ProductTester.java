package homework;

public class ProductTester {
    public static void main(String[] args) {
        Product p=new Product("shirt",50,2);
        p.printInfo();
        p.productPrice(50,2);
        System.out.println();
        DiscountedProduct d=new DiscountedProduct("shirt",50,2,0.1);
        d.printInfo();
        d.productPrice(60,2,0.1);
        System.out.println();

    }}

