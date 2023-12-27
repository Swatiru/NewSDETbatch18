package NestedIfElase;

public class Quiz1 {
    public static void main(String[] args) {
        int age = 10;
        int weight = 120;
        if (age >= 18) {
        if (weight > 110) {
            System.out.println("you are eligible");
        } else {
            System.out.println("ypu are not eligible for blood donation");
        }
    }else{
            System.out.println("we can not accept such patient");
        }
}}