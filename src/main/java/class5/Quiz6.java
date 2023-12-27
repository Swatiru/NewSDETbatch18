package class5;

public class Quiz6 {
    //Create an array on integers and calculate the sum of all elements in an array
    public static void main(String[] args) {
        int[] numbers = {10, 25, 44, 33, 56};
        int sum=0;

        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
