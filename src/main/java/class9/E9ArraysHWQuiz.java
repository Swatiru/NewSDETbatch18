package class9;

public class E9ArraysHWQuiz {
    public static void main(String[] args) {
        String[][] cars = {
                {"Chevrolet", "Ford", "Dodge"},
                {"BMW", "Mercedes", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}};

        for (String[] n : cars) {
            for (String a : n) {
                System.out.print(a + "  ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}



