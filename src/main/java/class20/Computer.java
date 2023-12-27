package class20;
/*OPTIONAL                     OPTIONAL                          MUST           MUST
    ( Access Modifier          NON-access modifier             Return Type      Name(){}
     Public,private,         (Static-Final-Abstract)
     protected,default)*/
public class Computer {

    public abstract class Abstract {

        abstract void executeCode();
        abstract void readEmails();
    }
    class Apple extends Abstract{

        @Override
        void executeCode() {
            System.out.println("BLA BLA BLA ");
        }

        @Override
        void readEmails() {
            System.out.println("Incoming Mail");
        }
    }








}
