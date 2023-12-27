package class9;

public class E1Array {
    public static void main(String[] args) {
        int[] numbers={10,15,20,18,9,60,22,30};
        // initially storing the first number as previous
        int previous=numbers[0];
// print true if array isSorted print true otherwisw print false
        boolean isSorted =true;
        for (int current:numbers) {
            //checking for any counter example
            if(previous>current) {
                isSorted = false;
                break;
            }
            // making our current as previous
            previous=current;
        }
        System.out.println("is array sorted "+isSorted);
         }
      }



