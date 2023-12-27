package class4;

public class QuizEnhanced1 {
    public static void main(String[] args) {
         int[] numbers = {101, 100, 25, 30, 25, 50, 300};
           int num5 = 0;
           int num2 = 0;
           for (int n : numbers) {
            if (n%5==0) {
                num5++;
            }
            if (n%2==0) {
                num2++;
            }
        }
             System.out.println("numbers divisible by 5 is " +num5);
            System.out.println("numbers divisible by 5 is "+num2);

    }
}


