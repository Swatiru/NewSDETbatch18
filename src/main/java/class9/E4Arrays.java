package class9;

public class E4Arrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 50,},
                {25, 35, 66},
                {80, 90, 78},
                {45, 55, 66}
        };
        int[] row = matrix[2];//gives entire one D array from the 2d array

        System.out.println(row[2]);//give element
        for (int n : row) {
            System.out.println(n + " ");
        }
        System.out.println();
        //accessing individual elements from the 2nd array
        System.out.println(matrix[2][2]);
    }
}