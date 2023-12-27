package class9;

public class Arrays2D {
    public static void main(String[] args) {
        int[] []matrix = {
                {10, 20, 50,},
                {25, 35, 66},
                {80, 90, 78},
                {45, 55, 66}
        };
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[3][2]);//
//give no of rows
        System.out.println(matrix.length);

        //for column
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[1].length);//3
    }
}
