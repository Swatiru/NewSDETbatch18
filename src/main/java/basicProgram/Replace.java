package basicProgram;

public class Replace {
    String censorLetter(String word ,char ch){
        return word.replaceAll(String.valueOf(ch),"*");

    }
    public static void main(String[] args) {
        Replace m = new Replace();
        System.out.println(m.censorLetter("computer science",'e'));
        System.out.println(m.censorLetter("trick or treat",'t'));


    }
}

