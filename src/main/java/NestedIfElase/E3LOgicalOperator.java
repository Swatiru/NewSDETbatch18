package NestedIfElase;

public class E3LOgicalOperator {
    public static void main(String[] args) {
        boolean cond1=true;
        boolean cond2=false;

        if(!(cond1||cond2)){
            System.out.println("if");
        }else{
            System.out.println("else");
        }
    }
}
