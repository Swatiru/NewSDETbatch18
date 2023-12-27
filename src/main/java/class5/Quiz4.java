package class5;

public class Quiz4 {
    // Create an array of cars and store 6 elements into it.
    // Using 2 different loops print all values from the array.

    public static void main(String[] args) {
        String[] car = new String[6];
        car[0] = "camry";
        car[1] = "kia";
        car[2] = "BMW";
        car[3] = "Tesla";
        car[4] = "Mustang";
        car[5] = "Ford";
        System.out.println(car[0]+ " "+car[1]+" "+car[2]+" "+car[3]+" "+car[4]+" "+car[5]);


        String[] cars = new String[6];
        cars[0] = "camry";
        cars[1] = "kia";
        cars[2] = "BMW";
        cars[3] = "Tesla";
        cars[4] = "Mustang";
        cars[5] = "Ford";
        for (int i = 0; i <= 5; i++) {
            System.out.print(cars[i]+" ");

        }
    }

}
