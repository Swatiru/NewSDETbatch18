package class14;
//Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
// Method should be available inside the class only where it was declared and executed by calling it is name.

public class HwVowels {
    private String vowels(String str){
    String word=str.replaceAll("[^aeiouAEIOU]","");
    return word;
    }

    public static void main(String[] args) {
        HwVowels word2=new HwVowels();
        String v=word2.vowels("hello java");
        System.out.println(v);
    }
}
