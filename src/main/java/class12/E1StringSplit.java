package class12;

public class E1StringSplit {
    public static void main(String[] args) {
        String str="Its savera birthday today. its sunday. today is java class";
        String[]strArr=str.split("[.]");


       System.out.println(strArr.length);
        System.out.println(strArr[2].trim());


    }
}
