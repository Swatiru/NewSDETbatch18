package review10Encapsulation;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(20);
        System.out.println(numbers);
        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("*****************************");
        for(Integer i:numbers){
            System.out.println(i);
        }
    }
}
