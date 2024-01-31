package class24HashMap;

import java.util.HashMap;

public class E10Lambda {
    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("apple", 20);
        maps.put("Banana", 15);
        maps.put("kiwi", 5);
        maps.put("orange", 20);
        //maps.entrySet().removeIf(e->e.getKey().contains("i"));
        //maps.entrySet().removeIf(e->e.getValue()==5||e.getKey().contains("o"));
        System.out.println(maps);

}

}
