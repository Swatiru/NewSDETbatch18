package NestedIfElase;

public class NotOperator {
    public static void main(String[] args) {
        boolean box=false;
        System.out.println(box);
        System.out.println(!box);
        System.out.println(box);

        if (!box){
            System.out.println("inside if part");
        }else{
            System.out.println("inside else part");
        }
    }
}
