package class4;

public class Loop9 {

    public static void main(String[] args) {
        int i = 100;
        while (i >= 1) {
            if ((i%2!=0)){
                System.out.print(i+" ");
            }
            i--;//i=i+2 we can solve even by this one even
        }

    }
}

