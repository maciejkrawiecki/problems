package Algorithms.codility;

import java.util.Arrays;

public class PermCheck {

    static int solution(int[] A) {

        int[] correctArray = new int[A.length];

        for (int i = 0; i < correctArray.length; i++) {
            correctArray[i] = i + 1;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] != correctArray[i]) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {

        int A2[] = {4, 1, 3, 2};
        int A1[] = {4, 1, 3};

        System.out.println(solution(A1));
        System.out.println(solution(A2));
    }
}
