package class24HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q5Map {
    /*Create a map of Best Buy store. Place item id and item name into it.
    Example (7664847 = Printer, 7879885= TV etc ) Retrieve all keys and values from a
    Best Buy map using EntrySet.*/
    public static void main(String[] args) {
        HashMap<Integer, String>bestbuy = new HashMap<>();
        bestbuy.put(76643,"Printer");
        bestbuy.put(76783,"Monitor");
        bestbuy.put(76793,"Computer");
        bestbuy.put(76788,"TV");
        bestbuy.put(76789,"Laptop");
        Set<Map.Entry<Integer,String>>entries=bestbuy.entrySet();
        for(Map.Entry<Integer,String>ent:entries){
            System.out.println(ent);
        }
        System.out.println("*******************");
        bestbuy.forEach((k,v)-> System.out.println("ID: "+k+" "+" Item: "+v));


    }
}
