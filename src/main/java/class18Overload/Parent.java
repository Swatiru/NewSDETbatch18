package class18;

public class Parent {

        void marry() {
            System.out.println("marry the girl");
        }
    }
    class karimi extends Parent{
        void marry(){
            System.out.println("i want to marry scarrlet");
        }
    }
    class Tester{
        public static void main(String[] args) {
            karimi k= new karimi();
            k.marry();
        }
    }

