package class9;

public class E3Arrays {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 50,},
                {25, 35, 66},
                {80, 90, 78},
                {45, 55, 66}
        };
        int[] row = matrix[2];//gives entire row

        System.out.println(row[2]);//give element

        for(int i=0;i<row.length;i++){
         System.out.print(row[i]+" ");
     }
    }
}
