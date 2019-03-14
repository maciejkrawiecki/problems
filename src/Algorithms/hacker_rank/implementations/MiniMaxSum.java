package Algorithms.hacker_rank.implementations;

import java.math.BigInteger;
import java.util.Arrays;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);

        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length-1; i++){
            min+=arr[i];
            max+=arr[i+1];
        }

        System.out.print(min + " " + max);
    }


}
