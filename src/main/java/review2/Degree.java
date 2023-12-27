package review2;

public class Degree {
    public static void main(String[] args) {
        boolean isDegree = true;
        double gpa = 4.5;
        if (isDegree) {
            System.out.println("congratulations");
            if (gpa >= 3.5) {
                System.out.println("you are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }


        } else {
            System.out.println("you should get a degree");
        }
    }}
