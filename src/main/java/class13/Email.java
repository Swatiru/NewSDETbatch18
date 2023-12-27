package class13;
//Create a method createEmail(). Based on values of users firstName, lastName and email type,
// your method should return complete email Address.
// Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
public class Email {
    String createEmail(String firstname,String lastname,String emailType){
        System.out.println(firstname+lastname+"@"+emailType);
        return(firstname+lastname+"@"+emailType);
    }
}
