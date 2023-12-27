package class9;

public class E9ArraysQuiz {
    public static void main(String[] args) {
         String[][] cars = {
                {"Chevrolet", "Ford", "Dodge"},
                {"BMW", "Mercedes", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}
                 };
                   for (String[] n: cars ){
                    for(String a:n){
                      System.out.print(a+"  ");

                  }
                       System.out.println();
              }}}




