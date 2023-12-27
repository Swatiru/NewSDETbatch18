package pQuestion;

public class ReplaceAll {
    public static void main(prac[] args) {
        String  str="nfskf  ASDB  SHD@   #%#$123";
        System.out.println(((String) str).replaceAll("[\\d]", ""));
        System.out.println(str.replaceAll("[\\s]",""));
    }
}
