package class22Collection;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("marisa");
        names.add("poorna ");
        names.add("damala");
        names.add("kamla");
        System.out.println(names.size());
        System.out.println(names.contains("hanana"));
        System.out.println(names);
        System.out.println(names.remove("kamala"));
        System.out.println(names);
        names.set(0,"nashima");
        System.out.println(names);
        System.out.println(names.indexOf("damala"));

    }
}