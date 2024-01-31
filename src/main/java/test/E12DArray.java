package test;

public class E12DArray {
    public static void main(String[] args) {
        int[][] num = {{12, 34, 67},
                {34, 67, 89},
                {20, 34, 60}};
        int sum=0;// this will give you total array sum
        for (int i = 0; i < num.length; i++) {
           //int sum=0;//this will give you each row sum
            for (int j = 0; j < num[i].length; j++) {
                // System.out.print(num[i][j] + " ");
                sum=sum+num[i][j];
            }
           // System.out.println(sum);//each row sum
        }
        System.out.println(num[1][1] + " ");
        System.out.println(sum);//total sum
    }
}

