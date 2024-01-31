package class11;

public class E11SubString {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(6,8));
        System.out.println( str.substring(9,str.length()));
        String str2="java is fun";
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5,7));
        System.out.println(str2.substring(0,str2.length()));
        System.out.println(str2.substring(5,str2.length()));

    }
}
