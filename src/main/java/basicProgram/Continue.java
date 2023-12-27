package basicProgram;

import java.util.Scanner;

public class Continue {
    //Compute the sum of 5 positive numbers
    public static void main(String[] args) {

        double number=0;
        double sum=0;
        // create an object of Scanner
        Scanner Input= new Scanner(System.in);
        for (int i = 0; i <6; i++) {
            // takes input from the user
            System.out.println("Enter a number" + i + "");
            number = Input.nextDouble();
            // if number is negative
            // continue statement is executed

            if (number < 0.0) {
                continue;
            }
            sum = sum + number;
        }
                 System.out.println(sum);
             }

        }



