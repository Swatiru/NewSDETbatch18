package class11;

public class E15QuizRevese {
    //Create a String and print it in reverse order (Sunday → yadnuS).
    public static void main(String[] args) {
        String str = "sunday";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i) + "");
        }
    }
}
