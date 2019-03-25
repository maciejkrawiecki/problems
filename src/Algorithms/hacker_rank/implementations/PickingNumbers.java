package Algorithms.hacker_rank.implementations;

import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);

        int max = 0;
        int count = 0;
        int current = a.get(0);

        for (int i = 0; i < a.size(); i++) {

            if (current == a.get(i) || Math.abs(current - a.get(i)) == 1) count++;
            else {
                current = a.get(i);
                if (count > max) max = count;
                count = 1;
            }

        }

        if (max == 0) return count;
        return max;
    }


}
