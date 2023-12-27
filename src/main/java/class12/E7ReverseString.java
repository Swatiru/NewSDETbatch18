package class12;

public class E7ReverseString {
    public static void main(String[] args) {
        String  a="This is Sentence i want to reverse";

        String words[]=a.split(" ");
        String reversedstring = "";

        for(int i=0;i<words.length;i++) {

            String word = words[i];
            String reverseWord = "";

            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedstring =reversedstring+ reverseWord + " ";
        }

        System.out.println(reversedstring);
    }
   }





