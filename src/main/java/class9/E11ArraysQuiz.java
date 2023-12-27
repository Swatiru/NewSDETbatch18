package class9;

public class E11ArraysQuiz {
    public static void main(String[] args) {
          int[][] numbers = {
                {10, 45, 56, 29},
                {15, 20, 56, 45},
                {20, 30, 39, 67},

              };

                   for (int i = 0; i < numbers.length; i++) {
               for (int j = 0; j < numbers[i].length; j++) {

                   if (numbers[i][j] % 2 == 0) {
                       System.out.print(numbers[i][j] + " ");
                   }


                }
            }
              }
             }

