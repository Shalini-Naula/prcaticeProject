package problems;

import java.util.HashMap;
import java.util.Map;

public class VaneckSeries {


    public static void main(String[] args) {
        int i = 0;
        int limit = 1000;
        int distance = 0, next = 0;
        String sequece = " ";
        Map<Integer, Integer> map = new HashMap<>();
        for (i = 0; i <= limit; i++) {
            if (map.containsKey(next)) {
                distance = i - map.get(next);
            } else {
                distance = 0;
            }
            map.put(next, i);
            sequece = next + ",";
            next = distance;
            System.out.print(sequece);
        }
    }
}