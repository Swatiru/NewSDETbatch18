package class11;

public class E10Index {
    public static void main(String[] args) {
        String str="Today is Saturday";
       // System.out.println(str.indexOf('T'));
       // System.out.println((str.indexOf('i')));

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){

        System.out.println(i);
       }
       }}}
