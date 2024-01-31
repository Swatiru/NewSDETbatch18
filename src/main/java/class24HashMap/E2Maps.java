package class24HashMap;

import java.util.HashMap;

public class E2Maps {
    public static void main(String[] args) {
        //implementinf             //class
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("apple", 20);
        maps.put("Banana", 15);
        maps.put("kiwi", 5);
        maps.put("orange", 20);
        //duplicate keys are not allowed if try it will replace previous one
        //maps.put("kiwi",15);
        System.out.println(maps);
        System.out.println(maps.remove("kiwi"));
        System.out.println(maps);
        maps.replace("apple",30);
        System.out.println(maps);

    }
}