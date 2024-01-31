package class24HashMap;

import java.util.HashMap;
import java.util.Set;

public class E3Maps {
    public static void main(String[] args) {
        //implementinf             //class
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("apple", 20);
        maps.put("Banana", 15);
        maps.put("kiwi", 5);
        maps.put("orange", 20);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        //returns the keys in the form of set
        Set<String>keys=maps.keySet();
        //convet attaylist
        //ArrayList<String> arrayList=new ArrayList<>(keys);
        for(String key:keys){
            System.out.println(key);
        }
    }
}