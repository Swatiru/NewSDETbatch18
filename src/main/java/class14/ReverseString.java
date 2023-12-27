package class14;
//Create a method that will take a String as a parameter and returns reversed String.
// Method should be available to all classes within your project and accessible by class name.
public class ReverseString {
    String a(String str){
        String rev="";
        for (int i = str.length()-1; i>=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;

        }

    public static void main(String[] args) {
        ReverseString r=new ReverseString();
        String s=r.a("my first class");
        System.out.println(s);

    }
    }

