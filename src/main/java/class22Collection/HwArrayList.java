package class22Collection;

import java.util.ArrayList;

public class HwArrayList {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("suv");
        car.add("ford");
        car.add("Bmw");
        car.add("toyota");
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }
            System.out.println("------------------");
        for(String veh:car){
            System.out.println(veh);
        }

    }
}