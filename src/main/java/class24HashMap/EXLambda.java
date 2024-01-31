package class24HashMap;

import java.util.ArrayList;

public class EXLambda {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Fah");
        names.add("Fahina");
        names.add("raah");
        names.add("ray");
        names.add("Hay");
        names.forEach(e-> System.out.println(e));
        System.out.println("*********************");
        names.forEach(e->{
            if(e.contains("a")){
                System.out.println(e);
            }
        });
        System.out.println("******************");
        names.removeIf(d->d.length()>3);
        System.out.println(names);
    }
}
