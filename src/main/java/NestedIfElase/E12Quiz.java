package NestedIfElase;

import java.util.Scanner;

public class E12Quiz {
    //Allow user to enter grade (A, B, or C etc...) and then provide explanation:
    // A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
    // At the end your program should print which grade was entered by a user with explanation.
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double quizMarks,midMarks,FinalMarks,avgMarks;
        System.out.println("please enter the Mark for Quiz0-100");
        quizMarks=sc.nextDouble();
        System.out.println("please enter the Mark for Quiz0-100");
        midMarks=sc.nextDouble();
        System.out.println("please enter the Mark for Quiz0-100");
        FinalMarks=sc.nextDouble();
        avgMarks=(quizMarks+midMarks+FinalMarks)/3;


        if(avgMarks>=90){
            System.out.println("grade A");

        }else if(avgMarks>=70){
            System.out.println("grade B");
        }else if(avgMarks>=50) {
            System.out.println("grade C");
        }else{
            System.out.println("fail");
        }

    }
}