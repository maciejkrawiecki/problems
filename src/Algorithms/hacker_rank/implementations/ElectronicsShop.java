package Algorithms.hacker_rank.implementations;

import java.util.Arrays;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int max = -1;
         if (keyboards[0] + drives[0] <= b) max= keyboards[0] + drives[0];

        for (int i = keyboards.length -1; i >= 0; i--){

            for (int j = drives.length-1; j >=0; j--){

                if (keyboards[i] + drives[j] > max && keyboards[i]+drives[j] <= b) max = keyboards[i]+drives[j];
            }
        }

        return max;
    }
}
