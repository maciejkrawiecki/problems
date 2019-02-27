package Algorithms.hacker_rank.implementations;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int totalCount = 0;

        for (int i = 0; i < ar.length; i++) {

            for (int j = i + 1; j < ar.length; j++) {

                if ((ar[i] + ar[j]) % k == 0) {
                    totalCount++;
                }
            }
        }
        return totalCount;
    }
}
