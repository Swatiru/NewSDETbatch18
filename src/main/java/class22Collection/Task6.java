package class22Collection;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("anna");
        names.add("anita ");
        names.add("aara");
        names.add("reena");
        for (int i = 0; i <names.size(); i++) {
           // System.out.println(names.get(i));
            String s = names.get(i);
            if (s.contains("a")||s.contains("e")) {
                //replace the element
                names.set(i, "water");
            }
        }
        System.out.println(names);
    }}

