package class5;

public class QuizSorted {
    public static void main(String[] args) {
        int[] numbers={10,15,20,18,9,60,22,30};
// print true if array isSorted print true otherwisw print false
        boolean isSorted =true;
    for (int i = 0; i < numbers.length-1; i++) {
//           10
        if(numbers[i] > numbers[i+1]) {
            isSorted = false;
            break;
        }
            }
        System.out.println("is loop sorted "+isSorted);
        }}


