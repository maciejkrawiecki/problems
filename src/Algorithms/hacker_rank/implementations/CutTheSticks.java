package Algorithms.hacker_rank.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) min = arr[i];
        }

        return min;
    }

    static int[] cutTheSticks(int[] arr) {

        boolean t = true;

        List<Integer> results = new ArrayList<>();

        while (t) {

            int currentMin = findMin(arr);
            int count = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= currentMin && arr[i] > 0) {
                    arr[i] -= currentMin;
                    count++;
                }
            }

            results.add(count);

            if (Arrays.stream(arr).allMatch(e -> e <= 0)) t = false;
        }

        int[] finalResult = new int[results.size()];

        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = results.get(i);
        }

        return finalResult;
    }

}
