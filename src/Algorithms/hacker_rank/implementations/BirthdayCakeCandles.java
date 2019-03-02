package Algorithms.hacker_rank.implementations;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        int numberOfCandles = 0;
        int max = ar[0];

        for (int i = 0; i < ar.length; i++){
            if (ar[i] > max) max = ar[i];
        }

        for (int n : ar){
            if (n == max) numberOfCandles++;
        }
        return numberOfCandles;
    }
}
