package NestedIfElase;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        System.out.println("Please Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=  sc.nextInt();
        System.out.println("Please Enter your full name");
        String fullName=sc.nextLine();
        System.out.println("Your name is "+fullName+" and you are "+age+" old");
    }
}
