package homework;
/*2)Online Shopping Cart:

Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated*/
public class Product {
    private String productName;
    double price;
    int quantity;
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }public void printInfo() {
        System.out.println(productName + " " + price + " " + quantity);
    }
       public void productPrice(double price,int quantity){
          double totalPrice =price*quantity;
           System.out.println("price is "+totalPrice);
    }}
    class DiscountedProduct extends Product{
    private double discount;
      public DiscountedProduct(String productName, double price, int quantity,double discount) {
        super(productName, price, quantity);
        this.discount=discount;
    }
    public void productPrice(double price,int quantity,double discount){
          double totalPrice=price*quantity*discount;
        System.out.println("price after discount is "+ totalPrice);
    }
}
