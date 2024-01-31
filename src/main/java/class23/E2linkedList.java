package class23;

import class16inheritance.Dog;

import java.util.LinkedList;

public class E2linkedList {
    public static void main(String[] args) {

            // Inside the <> we write the name of the class
            //whose objects we want to store
            LinkedList<Dog> dogs=new LinkedList<Dog>();
            Dog d1=new Dog("Jacky","German",12);
            dogs.add(d1);
    }
}
