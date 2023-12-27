package basicProgram;

public class PrintStatic3ways {
    static String ss="Welcome To Syntax Technologies";



    public static void main(String[] args){
        PrintStatic3ways m=new PrintStatic3ways();
        String s=PrintStatic3ways.ss;
        System.out.println(s);

        System.out.println(m.ss);

        System.out.println(ss);


    }

}






