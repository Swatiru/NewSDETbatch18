package class24HashMap;

import java.util.Arrays;

public class E9Anagram {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        char[] s1Arr=s1.toCharArray();
        char[] s2Arr=s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        System.out.println(Arrays.toString(s1Arr));
        System.out.println(Arrays.toString(s2Arr));

    }

}
