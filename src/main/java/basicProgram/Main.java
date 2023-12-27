package basicProgram;

public class Main {
      int num(int x){


        int sumEvenToX=0;
        for(int i=1;i<=x;i++){
            if(i%2==0){
                sumEvenToX=sumEvenToX+i;
            }
        }
        return sumEvenToX;
    }
    public static void main(String[] args) {
        Main m=new Main();
        int sumEvenToX=m.num(8);
        System.out.println(sumEvenToX);
    }}

