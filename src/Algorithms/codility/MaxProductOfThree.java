package Algorithms.codility;

import java.util.ArrayList;
import java.util.List;

public class MaxProductOfThree {

    static int solution(int[] A) {

        List<Integer> triplets = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {

            for (int j = i + 1; j < A.length; j++) {

                for (int w = j + 1; w < A.length; w++) {
                    triplets.add(A[i] * A[j] * A[w]);
                }
            }
        }

        return findMax(triplets);
    }

    static int findMax(List<Integer> list) {
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A = {-3, 1, 2, -2, 5, 6};
        System.out.println(solution(A));
    }
}
