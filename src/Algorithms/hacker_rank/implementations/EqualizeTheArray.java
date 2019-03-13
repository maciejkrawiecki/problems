package Algorithms.hacker_rank.implementations;

import java.util.Arrays;

public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {

        Arrays.sort(arr);

        int current = arr[0];
        int count = 0;
        int max = -1;

        for (int i = 0; i < arr.length; i++) {

            if (current != arr[i]) {
                current = arr[i];

                if (count > max) {
                    max = count;
                }
                count = 1;
            } else count++;
        }

        if (count > max) max = count;

        return arr.length - max;
    }

}
