package class4;

import java.util.Scanner;

public class ScannerAndLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please  enter the starting point");
        int start=scan.nextInt();
        System.out.println("please  enter the ending point");
        int end=scan.nextInt();
        System.out.println("please enter the step size as well");
        int step=scan.nextInt();


        while(start<=end){
            System.out.println(start+" ");
            start=start+step;
        }
    }
}
