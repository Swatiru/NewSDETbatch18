package NestedIfElase;

public class LogicalAnd {
    public static void main(String[] args) {
        boolean messageDisplayed = true;
        String errorMessage = "Invalid credentials";

        if (messageDisplayed && errorMessage.equals("Invalid Credentials")) {
            System.out.println("Test Case passed");
        } else {
            System.out.println("Test Case failed");
        }
    }
}