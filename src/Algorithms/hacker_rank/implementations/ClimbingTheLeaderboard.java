package Algorithms.hacker_rank.implementations;

import java.util.HashSet;
import java.util.Set;

public class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int positions;

        int[] result = new int[alice.length];


        for (int i = 0; i < alice.length; i++) {

            positions = 0;

            for (int j = scores.length-1; j >= 0 ; j--) {

                if (alice[i] > scores[j]) positions++;
                if (alice[i] == scores [j]) positions++;

            }

            int len = scores.length - positions;

            Set<Integer> set = new HashSet<>();

            for (int j = 0; j < len; j++) {
                set.add(scores[j]);
            }

            result[i] = set.size()+1;
        }

        return result;
    }

}
