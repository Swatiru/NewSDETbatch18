package class13;

public class PrimeNo {
    int prime(int number) {
        int count=0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
         if (count == 2) {
            System.out.println(number+"is prime no");
        }else{
            System.out.println(number+" not prime no");
        }
        return number;

      }}
