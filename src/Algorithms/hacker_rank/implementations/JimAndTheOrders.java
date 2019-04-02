package Algorithms.hacker_rank.implementations;

import java.util.Comparator;

public class JimAndTheOrders {

    static int[] jimOrders(int[][] orders) {

        int[][] sorted = new int[orders.length][2];

        for (int i = 0; i < sorted.length; i++) {

            for (int j = 0; j < 1; j++) {
                sorted[i][j] = i;
                sorted[i][j + 1] = orders[i][j] + orders[i][j + 1];
            }
        }

        int[] result = new int[orders.length];

        java.util.Arrays.sort(sorted, (Comparator<int[]>) (a, b) -> Integer.compare(a[1],b[1]));

        for (int i = 0 ;i<result.length;i++){
            result[i] = sorted[i][0]+1;
        }
        return result;
    }

}
