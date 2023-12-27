package class5;

public class Quiz5 {
    //Create an array of animals and store 5 elements into it.
    // Using 2 different loops print all elements from the array.
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "Dog";
        animals[1] = "cat";
        animals[2] = "Lion";
        animals[3] = "Mouse";
        animals[4] = "Dear";

        System.out.println(animals[0]+" " +animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);

        String[] animal = new String[5];
        animal[0] = "Dog";
        animal[1] = "cat";
        animal[2] = "Lion";
        animal[3] = "Mouse";
        animal[4] = "Dear";
        for(int i=0;i<=4;i++){
            System.out.print(animal[i]+" ");
        }
    }
}
