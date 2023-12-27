package class9;

public class Re2dArrayClass6 {
    public static void main(String[] args) {
        int[][] numbers = {

                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print((numbers[i][j])*2 +" ");
            }

        System.out.println();
    }

}}
