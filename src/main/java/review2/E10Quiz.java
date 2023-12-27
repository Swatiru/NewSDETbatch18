package review2;

import java.util.Scanner;

public class E10Quiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter current time");
        int hours=sc.nextInt();

        if(hours>=1&&hours<=11){
            System.out.println("morningh");

        }else if(hours>=12&&hours<=15){
            System.out.println("afternoon");

        }else if(hours>=16&&hours<=20){
            System.out.println("eveningh");
        }else if(hours>=21&&hours>=24){
            System.out.println("night");
        }else{
            System.out.println("invalid");
        }
    }
}
