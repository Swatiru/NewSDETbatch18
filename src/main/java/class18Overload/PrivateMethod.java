package class18;

public class PrivateMethod {
    private void print(){
        System.out.println("hello");

    }
    private void print(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        PrivateMethod p=new PrivateMethod();
        p.print();
        p.print("java");
    }
}
