package Algorithms.codility;

import java.util.Arrays;

public class PermMissingElem {

    static int solution(int A[]) {

        int missing = 0;
        int[] fullArray = new int[A.length + 1];

        for (int i = 0; i < fullArray.length; i++) {
            fullArray[i] = i + 1;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != fullArray[i]) {
                missing = i + 1;
                break;
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(solution(A));
    }
}

