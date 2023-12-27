package NestedIfElase;
/*Write a program that will prompt the user for
Day number and print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday
from 6-7 → output “It is a weekend”, any other day → output
“Invalid day”
Test your task for -1 3 6 and 8*/

import java.util.Scanner;

public class E9Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number from 1 to 7");
        int day=sc.nextInt();

        if(day>=1&&day<=5){
            System.out.println("weekday");
        }else if(day>=6&&day<=7){
            System.out.println("weekend");

        }else{
            System.out.println("invalid day");
        }


    }
}
