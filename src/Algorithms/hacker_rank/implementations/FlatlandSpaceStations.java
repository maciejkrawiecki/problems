package Algorithms.hacker_rank.implementations;

import java.util.Arrays;

public class FlatlandSpaceStations {

    static int flatlandSpaceStations(int n, int[] c) {

        Arrays.sort(c);

        if (n == c.length) return 0;

        int max = 0;
        if (c.length == 1){
            if (Math.abs(n - c[0]) > c[0])
                return  n - c[0]-1;
            return c[0]-1;
        }

        if (c[0] != 0) max = c[0];

        if (c[c.length-1] != n-1){

            if (Math.abs(c[c.length-1] - n) > max) max = Math.abs(c[c.length-1] - n)-1;
        }

        for (int i = 1; i <= c.length - 1; i++) {

            if ((c[i] - c[i-1]) / 2 > max) max = (c[i] - c[i-1]) / 2;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] A = {99};
        System.out.println(flatlandSpaceStations(100, A));
    }
}


