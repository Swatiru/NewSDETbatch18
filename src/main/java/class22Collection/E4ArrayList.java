package class22Collection;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("marisa");
        names.add("poorna ");
        names.add("damala");
        names.add("kamla");
        for (int i = 0; i <names.size(); i++) {
            System.out.println(names.get(i));
           // System.out.println(s.length());
        }
        System.out.println("----------------");
for(String s:names){
    System.out.println(s);
}
        }
}
