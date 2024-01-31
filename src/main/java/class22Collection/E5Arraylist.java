package class22Collection;

import java.util.ArrayList;

public class E5Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("marisa");
        names.add("poorna ");
        names.add("damala");
        names.add("kamla");
        for (int i = 0; i <names.size(); i++) {
            System.out.println(names.get(i));
            String s=names.get(i);
            if(s.contains("o")) {
                System.out.println("yes");
            }else{
                System.out.println("no");

            }
        }

    }
}
