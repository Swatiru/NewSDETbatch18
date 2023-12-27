package class11;

public class E6StringQuiz {
    public static void main(String[] args) {
        String userName="swatimbi";
        String password="swati123";
        String confirmPassword="swati123";

          if(userName.isEmpty()||password.isEmpty()) {
              System.out.println("username and password can not be empty");
         }else if(password.length()<8) {
              System.out.println("password is too short");
          }else if(password.contains(userName)) {
              System.out.println("password cannot contain username");
          }else if(!password.equals(confirmPassword)) {
              System.out.println("password is not match");
          }else{
              System.out.println("your username password has been created");
         }
        }

    }

