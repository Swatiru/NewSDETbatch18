package class4;

import java.util.Scanner;

public class HWpracti {
    public static void main(String[] args) {
        int[] num =new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.println("please enter a no" + (i+1));
            num [i]=sc.nextInt();

        }
        System.out.println("here all thew no that you entered");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i] +" ");
    }
}}
