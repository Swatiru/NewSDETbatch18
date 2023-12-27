package NestedIfElase;

import java.util.Scanner;

public class E6NestedIfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("i will issue a driving license to you");
        }else{
            System.out.println("for now you can have learners permit");
        }
    }
}
