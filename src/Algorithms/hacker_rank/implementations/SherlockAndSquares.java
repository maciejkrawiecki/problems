package Algorithms.hacker_rank.implementations;

public class SherlockAndSquares {

    static int squares(int a, int b) {

        int first = (int) Math.ceil(Math.sqrt(a));
        int second = (int) Math.ceil(Math.sqrt(b));
        int count = 0;

        for (int i = first; i <= second; i++){
            if (Math.pow((double) i, 2) >= a && Math.pow((double) i, 2) <= b) count++;
        }

        return count;
    }

}
