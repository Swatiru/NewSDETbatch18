package class23;

import java.util.LinkedHashSet;

public class Quiz3 {
    public static void main(String[] args) {
        LinkedHashSet<String> numbers=new LinkedHashSet<>();
        numbers.add("Argentina");
        numbers.add("France");
        numbers.add("Usa");
        numbers.add("Italy");
        numbers.add("India");
        numbers.add("Dubai");
        System.out.println(numbers);
        numbers.removeIf(x->x.startsWith("A"));
        System.out.println(numbers);
    }
}
