package NestedIfElase;

import java.util.Scanner;

public class E16QuizCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter First no");
        double num1=sc.nextDouble();
        System.out.println("please enter second no");
        double num2=sc.nextDouble();
        System.out.println("please enter operator(+,_,*,/)");
        String a=sc.next();

        switch (a){
            case "+":
                System.out.println(num1+num2);
                break;

            case"-":
                System.out.println(num1-num2);
                break;

            case"*":
                System.out.println(num1*num2);
                break;

            case"/":
                    System.out.println(num1/num2);
                    break;

            default:
                System.out.println("invalid operator");

        }
    }
}
