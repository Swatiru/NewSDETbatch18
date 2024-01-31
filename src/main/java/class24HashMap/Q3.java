package class24HashMap;

import java.util.Map;
import java.util.TreeMap;

public class Q3 {
        public static void main(String[] args) {
            Map<String,String> country=new TreeMap<>();
            country.put("USA","Washington DC");
            country.put("Ukraine","Kyiv");
            country.put("India","Delhi");
            country.put("Turkey","Ankara");
            country.put("Germany","Berlin");

            country.forEach((k, v)-> System.out.println(k));
            System.out.println("*");
            country.forEach((k, v)-> System.out.println(v));
        }
    }

