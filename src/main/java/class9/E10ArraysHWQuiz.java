package class9;

public class E10ArraysQuiz {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
        String[][] groceryList = {
                {"cabbage", " potato", "onion", "tomato"},
                {"banana", "mangoes", "orange", "kiwi"},
                {"milk", "yogurt", "cheese", "milkshake"},
                {"chocolate", "pastry", "sweets", "cake"}
        };
        for (String[] n : groceryList) {
            for (String list : n) {

                System.out.print(list + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j] + " ");
            }
            System.out.println();
        }


    }
}




