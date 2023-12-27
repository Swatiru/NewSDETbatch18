package NestedIfElase;

import java.util.Scanner;

public class Quiz13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please inter your country");
        String country=scanner.nextLine();
        switch (country.toLowerCase()) {
            case "india":
                System.out.println("hindi");
                break;
            case "usa":
                System.out.println("english");
                break;
            case "spain":
                System.out.println("spainish");
                break;
            case "rasia":
                System.out.println("rasian");
                break;
        }
    }
}