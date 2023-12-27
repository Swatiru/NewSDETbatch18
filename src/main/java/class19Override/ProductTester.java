package class19Override;

public class ProductTester {
    public static void main(String[] args) {
        Product[] p={new Electronics(2000,"Fan","A245",1),
                new Clothing(1000,"pant","P34"),
                new Furniture(5000,"sofa","S567"),
                new Book(100,"java","J123")};

        for (int i = 0; i <p.length ; i++) {
            Product p2=p[i];
            p2.printInfo();
            System.out.println();
            if (p2 instanceof Electronics){
                ((Electronics)p2).applyWarranty();
                System.out.println();
        }

        }
        }}


