package class9;

import java.util.Arrays;
import java.util.Scanner;

public class Re2dScanner2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of the array");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("please enter the number ");
            numbers[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }

}
