package class11;

public class E15QuizReverse {
    //Create a String and print it in reverse order (Sunday → yadnuS).
    public static void main(String[] args) {
        String str = "sunday";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
