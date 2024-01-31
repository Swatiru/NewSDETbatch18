package class12;

public class E7ReverseString {
    public static void main(String[] args) {
        String  a="This is Sentence i want to reverse";
                                                                                // 0,       1,    2
        String[] words =a.split(" ");//this line make sentence a array forex "this","is","sentence
        String reversedstring = "";

             for(int i=0;i<words.length;i++) {//this line run word one by one
            String word = words[i];//position of word in array
            String reverseWord = "";//store reverse word
            for (int j = word.length()-1; j >= 0; j--)//this line reverse word one by one
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedstring =reversedstring+ reverseWord + " ";
        }

        System.out.println(reversedstring);
    }
   }





