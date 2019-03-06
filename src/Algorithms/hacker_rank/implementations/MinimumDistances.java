package Algorithms.hacker_rank.implementations;

public class MinimumDistances {
    static int minimumDistances(int[] a) {

        int min = 2147483647;

        for (int i = 0; i < a.length; i++) {


            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    if (Math.abs(i - j) < min) {
                        min = Math.abs(i - j);
                    }
                }
            }
        }

        // i know it's stupid XD
        if (min == 2147483647) return -1;
        return min;
    }
}
