package review11;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E2Map {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentMap=new LinkedHashMap<>();
        studentMap.put("john",95);
        studentMap.put("Adam",88);
        studentMap.put("swati",92);
        studentMap.put("muh",85);
        studentMap.put("kari",90);
        System.out.println(studentMap);
        //studentMap.forEach((k,v)->{
        ArrayList<String> names=new ArrayList<>();//print names of those who got more than 90? or did you ask to use arraylist? I missed that part. I simply changed the sout statement
        studentMap.forEach((k,v)->{
            //u can write code(if cond)here
            if(v>=90)
                names.add(k);
        });
        System.out.println(names);

    }
}
