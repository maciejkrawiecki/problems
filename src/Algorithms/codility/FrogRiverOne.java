package Algorithms.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    static int solution(int x, int[] A, int n) {

        Set<Integer> checkSet = new HashSet<>();

        int result = -1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] >= 1 && A[i] <= x) {
                checkSet.add(A[i]);
            }

            if (checkSet.size() == x) {
                result = i;
                break;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

        System.out.println(solution(5, A, A.length));
    }
}
