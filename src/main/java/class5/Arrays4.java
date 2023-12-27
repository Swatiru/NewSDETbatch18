package class5;

public class Arrays4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 56, 55, 67, 89, 80};
        //this is how we can get the size of array
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 55) {
                System.out.print("found");
                break;
            }

        }
    }
}