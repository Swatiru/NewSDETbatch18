package class9;

public class Re2DarraysClass5 {
    public static void main(String[] args) {
        int[][] numbers = {

                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };
        // getting back complete 1d array back from 2d array
        int[] row0 = numbers[0];

        //getting back individual number from 2d array
        int num=numbers[0][0];
        System.out.println(num);
    }
}
