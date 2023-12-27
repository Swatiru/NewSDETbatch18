package homework;
/*1)Create a class Car with properties like make, model, and year.
   Implement a method calculate_rental_price based on the number of rental days.
   Create two subclasses: LuxuryCar and EconomyCar. Override the calculate_rental_price method in LuxuryCar to include additional charges.
 Demonstrate the functionality by creating instances of each class and calling their methods*/
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void printInfo() {
        System.out.println("Rental car "+make + " " + model + " " + year);
    }
        public void rentalPrice(int days,int perDays){
            int carPrice=perDays*days;
            System.out.println("price for "+days+" days for car price "+carPrice);
    }
    }
    class LuxuryCar extends Car{
        public LuxuryCar(String make, String model, int year) {
            super(make, model, year);
        }
            public void rentalPrice(int days,int perDays,int additionalCharge){
                int carPrice=perDays*days+additionalCharge;
                System.out.println("price for "+days+" days for luxuryCar price "+carPrice);
            }}
        class EconomyCar extends Car{
            public EconomyCar(String make, String model, int year) {
                super(make, model, year);
            }
        }

