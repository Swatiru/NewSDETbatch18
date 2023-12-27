package class9;

public class prac1 {
    public static void main(String[] args) {


        int[][] matrix = {
                    {10, 20, 50,},
                        {25, 35, 66},
                        {80, 90, 78, 45},
                        {45, 55, 66}
                };
        int sum = 0;
        // int[ ]row=matrix[0];
        for (int[] n : matrix) {
            for (int a : n) {
                sum = sum + a;
            }
        }

        System.out.print(sum + " ");

    }

             }
