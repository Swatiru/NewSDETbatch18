package class19Override;
/*3)E-Commerce System Task: Build a Product class with subclasses like Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
 Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop through to display or calculate prices and taxes.*/
public class Product {
    private double price;
    private String name;
    private String SKU;
    public Product(double price, String name, String SKU) {
        this.price = price;
        this.name = name;
        this.SKU = SKU;
    }
    public double getPrice(){

        return price;
    }
    public String getName(){
        return name;
    }
    public String getSKU(){

        return SKU;
    }
    public double calTax(){
        return 0.01*getPrice();}
        public void printInfo(){
            System.out.println("product name "+getName());
            System.out.println("SKU "+getSKU());
            System.out.println("Price "+getPrice());
            System.out.println("product Tax: "+calTax());
        }
    }
    class Electronics extends Product{
private int WarrantyYears;

        public Electronics(double price, String name, String SKU, int WarrantyYears) {
            super(price, name, SKU);
            this.WarrantyYears = WarrantyYears;
        }
        public void applyWarranty(){
            System.out.println("warranty of years"+WarrantyYears+" on "+getName() );
        }

        @Override
        public double calTax() {
            return 0.01*getPrice();
        }
    }
class Clothing extends Product{
    public Clothing(double price, String name, String SKU) {
        super(price, name, SKU);
    }@Override
    public double calTax() {
        return 0.01*getPrice();
    }}
class Furniture extends Product{
    public Furniture(double price, String name, String SKU) {
        super(price, name, SKU);
    }

    @Override
    public double calTax() {
        return 0.01*getPrice();
    }}
class Book extends Product{

    public Book(double price, String name, String SKU) {
        super(price, name, SKU);
    }

    @Override
    public double calTax() {
        return 0.01*getPrice();
    }
}
