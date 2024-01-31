package class24HashMap;

import java.util.HashMap;

public class E1Maps {
    public static void main(String[] args) {
        //implementinf             //class
        HashMap<String,Integer> maps=new HashMap<>();
        maps.put("apple",20);
        maps.put("Banana",15);
        maps.put("kiwi",5);
        maps.put("orange",20);
        //duplicate keys are not allowed if try it will replace previous one
        //maps.put("kiwi",15);
        System.out.println(maps);
        System.out.println(maps.size());
        System.out.println(maps.containsKey("apple".toUpperCase()));
        System.out.println(maps.containsValue(25));
        System.out.println(maps.containsValue(5));
        System.out.println(maps.isEmpty());
        System.out.println(maps.get("kiwi"));


    }
}
