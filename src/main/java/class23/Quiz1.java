package class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Quiz1 {
    public static void main(String[] args) {
        List<String>aList=new ArrayList<>();
        aList.add("john");
        aList.add("jann");
        aList.add("james");
        aList.add("jasmine");
        aList.add("jane");
        aList.add("james");
        System.out.println(aList);
        LinkedHashSet<String> aList1=new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(aList1);
        System.out.println(aList1);


    }
}
