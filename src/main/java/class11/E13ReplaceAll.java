package class11;

public class E13ReplaceAll {
    public static void main(String[] args) {
        String str="nfskAS DBSH D@#$#$123";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Za-z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[!-?]",""));
        System.out.println(str.replaceAll("[#-*]",""));
        System.out.println(str.replaceAll("[\\d]",""));
        System.out.println(str.replaceAll("[\\s]",""));




       // System.out.println((int) 'A');
    }
}
