package Algorithms.hacker_rank.implementations;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {

        int max = -1;

        for (int i = 0; i < height.length; i++){

            if (height[i] > max) max = height[i];
        }

        if (max <= k) return 0;
        return max-k;
    }

}
