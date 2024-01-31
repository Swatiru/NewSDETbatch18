package review11;

import java.util.LinkedHashMap;

public class E3Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentMap=new LinkedHashMap<>();
        studentMap.put("john",95);
        studentMap.put("Adam",88);
        studentMap.put("swati",92);
        studentMap.put("muh",85);
        studentMap.put("kari",90);
        //System.out.println(studentMap);
        //if the name of student the letter aor if marks less than 90 remove those
        studentMap.entrySet().removeIf(x->x.getValue()<=90);
        System.out.println(studentMap);
    }
}
