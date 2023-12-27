package basicProgram;

public class BooleanTrueOrFalse {
        boolean num(int number1, int number2) {
            if((number1% 2 == 0) && (number2% 2 == 0)){
                return true;
            }
            else
            {

                return false;
            }

        }
            public static void main(String[] args) {
                BooleanTrueOrFalse obj = new BooleanTrueOrFalse();
            boolean n= obj.num(8, 6);
            System.out.println(n);
        }
    }

