package Algorithms.hacker_rank.implementations;

public class Pairs {

    static int pairs(int k, int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (Math.abs(arr[i] - arr[j]) == k) count++;
            }
        }

        return count;
    }

}
