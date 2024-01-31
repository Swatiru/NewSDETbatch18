package class24HashMap;

import java.util.HashMap;

public class E7Lambda {
    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("apple", 20);
        maps.put("Banana", 15);
        maps.put("kiwi", 5);
        maps.put("orange", 20);
        maps.forEach((k,v)-> System.out.println(k));// if u use more than one data like arraylist one data so dont use double parentesis
        maps.forEach((k,v)-> System.out.println(v));
        maps.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("***************************");
        // for more than 1 line of code u use lambda like this below
        maps.forEach((k,v)->{
            if(k.contains("a")||v>10){
                System.out.println(k+" "+v);

            }
        });
    }
}
