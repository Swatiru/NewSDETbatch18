package NestedIfElase;

import java.util.Scanner;

public class E11Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your birth season");
        String month=sc.next();


        if(month.equals("march")||month.equals("april")||month.equals("may")){
            System.out.println("spring");
        }else if(month.equals("june")||month.equals("july")||month.equals("aug")){
            System.out.println("fall");
        }else if(month.equals("december")||month.equals("jan")||month.equals("fab")){
            System.out.println("winter");
        }else{
            System.out.println("invalid");
        }

    }
}
