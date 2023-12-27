package class5;

public class QuizEnhanced2 {
    public static void main(String[] args) {
        int[] numbers={10,15,20,18,9,60,22,30};
        int sumEven=0;
        int sumOdd=0;
        for(int num:numbers){
            if(num%2==0){
         sumEven=sumEven+num;
            }else{
                sumOdd=sumOdd+num;

            }
        }
        System.out.println("sum of even no is "+sumEven);
        System.out.println("sum of odd no is "+sumOdd);
    }
}
