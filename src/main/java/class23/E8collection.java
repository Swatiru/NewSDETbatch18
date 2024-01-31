package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E8collection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(10);
        numbers.add(5);
        System.out.println(numbers);
        //convert in HasSet to remove duplicate and in order
        LinkedHashSet<Integer>uniqueNumber=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumber);

        TreeSet<Integer>treeSet=new TreeSet<>();
        System.out.println(treeSet);
    }
}
