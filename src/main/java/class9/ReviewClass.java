package class9;

public class ReviewClass {
    public static void main(String[] args) {
        int[] numbers={10,25,36,56,80};
        System.out.println(numbers.length);
        System.out.println(numbers[2]);
            for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
        for(int n:numbers){
            System.out.println(n);
        }
    }


}
