package class5;

public class ReverseEachWord {
    public static void main (String[]args){
        String str="i love java";
        String[] word=str.split(" ");
        for(String rev:word){
            for(int i=rev.length()-1;i>=0;i--){
                System.out.print(rev.charAt(i));
            }
            System.out.print(" ");
        }}
}
