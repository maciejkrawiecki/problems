package Algorithms.hacker_rank.implementations;

public class MinimumDistances {
    static int minimumDistances(int[] a) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {


            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {

                    if (Math.abs(i - j) < min) {
                        min = Math.abs(i - j);
                    }
                }
            }
        }



        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
