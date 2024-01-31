package class22Encapsulation;

public class ProductTester {
    public static void main(String[] args) {
        HwProduct product=new HwProduct("PI002","Cycle",2000,100);

        product.setProductName("Motorcycle");
        product.setPrice(70000);
        product.setStockQuantity(70);

        product.reStock(5);
        product.printProductDetails();
        System.out.println(product.sell(50));


    }
}
