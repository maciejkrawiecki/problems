package Algorithms.hacker_rank.implementations;

import java.util.HashMap;
import java.util.Map;

public class FirstReccuringCharacter {

    public static char find(String s) {

        String str = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char car : str.toCharArray()) {

            if (!map.containsKey(car)) {
                map.put(car, 1);
            } else return car;
        }
        return '0';
    }
}
