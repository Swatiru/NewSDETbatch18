package class5;

public class reviewLoop4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { //outer loop
            System.out.println("hello");
            for (int j = 1; j <= 3; j--) {// inner loop infinite
                System.out.println("Bye");
            }

        }
    }
}

