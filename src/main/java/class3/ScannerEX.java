package class3;

import java.util.Scanner;

public class ScannerEX {
    //Ask user to enter a number and then categorize if number is small, medium or large
    //Small number is value between 1 and 10
    //Medium number is value between 11 and 100
    //Large number is value between 101 and 1000

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a no");
        int no=sc.nextInt();

        if(no>=1&&no<=10){
            System.out.println("no is small");

        }else if(no>=11&&no<=100){
            System.out.println("no is medium");

        }else if(no>=101&&no<=1000){
            System.out.println("no is large");

        }else{
            System.out.println("invalid");
        }


    }
}
