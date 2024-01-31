package class24HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Quiz1 {
    public static void main(String[] args) {
        Map<Integer, String> floor = new LinkedHashMap<>();
        floor.put(1, "Google");
        floor.put(2, "syntax");
        floor.put(3, "MicroSoft");
        floor.put(4, "Dell");
        floor.put(5, "Kpmg");
        floor.put(6, "Kpmg");
        floor.put(7, "info");
        System.out.println(floor);
        System.out.println(floor.size());
        floor.replace(4,"LG");
        System.out.println(floor);

    }
}
