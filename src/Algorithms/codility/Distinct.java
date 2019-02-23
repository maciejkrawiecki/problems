package Algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    static int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int e : A) {
            set.add(e);
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] A = {2,1,1,2,3,1};

        System.out.println(solution(A));

    }
}
