package review2;

public class NestedIf {
    public static void main(String[] args) {
        //nested if-> if statement inside if statement
        boolean allergy = true;
        String allergyType = "peanut";

        if (allergy) { //outer if
            System.out.println("lets check what kind of allergy you have");

            if (allergyType.equals("peanut")) {//nested if
                System.out.println("please avoid food that contain peanuts");

            }else if(allergyType.equals("dairy")){
                System.out.println("please avoid food that contain dairy");

            }else if(allergyType.equals("pollen")){
                System.out.println("please stay at home indoor");
            }
        }
    }
}