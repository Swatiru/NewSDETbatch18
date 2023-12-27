package class13;

public class Printer {
    void printName(){

        System.out.println("hello world");
    }
    void printWord(String word){

        System.out.println(word);
    }
    void printManyTimes(String word,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(word);

        }
    }
}
