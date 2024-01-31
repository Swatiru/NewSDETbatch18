package test;

public class ReveseSen {
    public static void main(String[] args) {
        String str="i love java";
        String word[]=str.split(" ");
        String reverseString="";
        for (int i = 0; i < word.length; i++) {
            String words=word[i];
            String reverseWord="";
            for (int j=words.length()-1; j >=0 ; j--) {
                reverseWord = reverseWord + words.charAt(j);
            }
                reverseString=reverseString+reverseWord+" ";

            }
        System.out.println(reverseString);

        }
    }

