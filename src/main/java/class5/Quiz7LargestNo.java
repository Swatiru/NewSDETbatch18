package class5;

public class Quiz7LargestNo {
    //From an array of integer elements find the largest number.
    public static void main(String[] args) {
        int[] number={30,50,70,20,80};
        int largestNumber=0;
        for(int i=0;i<number.length;i++){
            if(number[i]>largestNumber){
                largestNumber=number[i];
            }
        }
        System.out.println(largestNumber);
    }
}
