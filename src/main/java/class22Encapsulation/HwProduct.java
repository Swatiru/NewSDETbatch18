package class22Encapsulation;
/*ask: Create a Product Class for an Inventory System
Objective:
Develop a Product class for an inventory system to apply the principles of encapsulation.

Requirements:
Define Class Variables:

productID (String)
productName (String)
price (double)
stockQuantity (int)
Encapsulate the Variables:

Set all the class variables to private. This restricts direct access from outside the class.
Create a Constructor:

Define a constructor for the Product class that takes the productID, productName, price, and stockQuantity as parameters.
Implement Getter and Setter Methods:

Provide public getter and setter methods for productName, price, and stockQuantity.
Only provide a getter for productID, as it should not be changeable once set.
Additional Methods:

restock(int amount): Adds the specified amount to the stockQuantity.
sell(int amount): Reduces the stock quantity by the specified amount and returns the total sale price.
Ensure the stock does not go negative.
printProductDetails(): Prints details of the product.
Test Your Class:
In your main method, create an instance of Product.
Use the setters to modify the product details as needed.
Perform restocking and selling operations.
Print product details to verify your code */
public class HwProduct {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public HwProduct(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;

    }
    public String getProductId() {
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity ){
        this.stockQuantity=stockQuantity;
    }
    public void reStock(int amount){
        this.stockQuantity=stockQuantity+amount;
    }
    public double sell(int amount) {
        if (amount <= stockQuantity) {
            amount = stockQuantity - amount;
            return amount * price;//product sell price
        }else {
            System.out.println("product stock is low");
        }
        return 0;
      }
         public void printProductDetails(){
          System.out.println("Product id: "+productId+"  "+"Product name: "+productName+" "+"Product price: "
               +price+" "+"Product Stock: "+stockQuantity);
   }
}