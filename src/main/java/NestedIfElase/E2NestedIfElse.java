package NestedIfElase;

public class E2NestedIfElse {
    public static void main(String[] args) {
        double budget=50000;
        String engineType="Hybrid";
        if(budget>100000){

            if (engineType.equals("Electric")) {
                System.out.println(" i want to buy Tesla");
            }else if(engineType.equals("Hybrid")) {
                System.out.println(" i want to buy Toyota");
            }else{
                System.out.println("i want to buy porche");
            }
        }else if(budget>=30000){
            if (engineType.equals("Electric")) {
                System.out.println("i want to byd");
            }else if (engineType.equals("Hybrid")) {
                System.out.println("i want to by camery");
            }else{
                System.out.println("hundai sonata");
            }
        }else if (budget>=20000){
            if (engineType.equals("Electric")){
                System.out.println("nissan leaf");
            }else if (engineType.equals("Hybrid")){
                System.out.println(("Kia"));
            }else{
                System.out.println(("honda civic"));
            }
        }else{
            System.out.println("lets save more");
        }
    }
}
