package Algorithms.hacker_rank.implementations;

import java.util.Arrays;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {

        int[] arr = Arrays.stream(a).filter(x -> x <= 0).toArray();

        if (arr.length >= k) return "NO";
        return "YES";
    }
}
