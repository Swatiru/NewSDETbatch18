package class23;

import java.util.TreeSet;

public class Quiz2 {
    public static void main(String[] args) {
        TreeSet<String> numbers=new TreeSet<>();
        numbers.add("Agra");
        numbers.add("France");
        numbers.add("Usa");
        numbers.add("Italy");
        numbers.add("India");
        numbers.add("Dubai");
        System.out.println(numbers);
        for(String n:numbers){

                System.out.println(n);
            }
    }
}
