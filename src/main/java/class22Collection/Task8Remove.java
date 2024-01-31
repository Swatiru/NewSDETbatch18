package class22Collection;

import java.util.ArrayList;

public class Task8Remove {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("carlosa");
        names.add("kim jon ");
        names.add("nazir");
        names.add("sherif");
                       //lambda expression x->
        names.removeIf(x->x.endsWith("a"));
        System.out.println(names);
        names.forEach(x-> System.out.println(x));
        /*for (int i = 0; i <names.size(); i++) {
            if (names.get(i).endsWith("a") ){
               names.remove(i);
               i-- ;
            }
            }

        System.out.println(names);*/

}}
