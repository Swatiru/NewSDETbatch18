package class25FileHandling;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class E7NestedData {
    public static void main(String[] args) {
        Map<Integer,ArrayList<Integer>> nestedArr=new LinkedHashMap<>();

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(12);
        arr1.add(15);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(5);
        arr2.add(3);
        arr2.add(2);

        nestedArr.put(1,arr1);
        nestedArr.put(2,arr2);
        System.out.println(nestedArr);
    }
}
