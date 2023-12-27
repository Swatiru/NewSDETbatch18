package NestedIfElase;

import java.util.Scanner;

public class E15QuizCalculator {
    /* HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on
    operator provide the result to user.Please complete this assignment in 2 ways:
    using if statement and switch case.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter First no");
        double num1=sc.nextDouble();
        System.out.println("please enter second no");
        double num2=sc.nextDouble();
        System.out.println("please enter operator(+,_,*,/)");
        String a=sc.next();

        if(a.equals("+")){
            System.out.println("result is "+(num1+num2));

        }else if(a.equals("-")){
            System.out.println("result is "+(num1-num2));

        }else if(a.equals("*")){
            System.out.println("result is "+(num1*num2));


        }else if(a.equals("/")){
            System.out.println("result is "+(num1/num2));

        }else{
            System.out.println("wrong operator");
        }



    }
}
