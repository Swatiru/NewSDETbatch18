package test;

import java.util.Arrays;
import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the array size");
        int size = sc.nextInt();
        int[] num=new int[size];
        System.out.println(num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.println("please enter the no");
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));

        }

    }

