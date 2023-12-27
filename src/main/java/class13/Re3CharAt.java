package class13;

public class Re3CharAt {
    public static void main(String[] args) {
        String str="Today is a JAVA review class";
        System.out.println(str.charAt(5));
        // convert the letters to lowercase
        str=str.toLowerCase();
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("Letter a appeared "+counter+" times");
    }}