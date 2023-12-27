package NestedIfElase;

import java.util.Scanner;

public class E7Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("person height");
        double height=sc.nextDouble();

        if(height<60){
            System.out.println("short");
        }else if(height>=60&&height<72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }
    }
}
