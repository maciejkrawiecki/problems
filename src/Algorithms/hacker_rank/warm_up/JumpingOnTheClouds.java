package Algorithms.hacker_rank.warm_up;

public class JumpingOnTheClouds {

    public static int solution(int[] c) {

        int jumps = 0;

        if (c.length == 2 && c[1] == 0) return 1;

        for (int i = 2; i < c.length; i++) {

            if (c[i] == 0) {
                jumps++;
                if (i + 2 < c.length)i++;

            } else if (c[i - 1] == 0) {
                jumps++;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {


        int A[] = {0, 0};
        System.out.println(solution(A));
    }
}
