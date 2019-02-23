package Algorithms.codility;

import java.util.Arrays;

public class CyclicRotation {

    static int [] rotatedArray(int[] A, int k) {

        if (k >= A.length) {
            k = k % A.length;
        }
         if (k == 0) return A;

        int counter = 0;

        int[] rotated = new int[A.length];

        for (int i = 0; i <= A.length - k - 1; i++) {
            counter++;
            rotated[i + k] = A[i];
        }

        for (int i = 0;  i <= A.length-counter-1; i++) {
            rotated[i] = A[i+counter];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int A[] = {2, 2, 2, 4, 5, 6, 7};
        Arrays.stream(rotatedArray(A, 4)).forEach(System.out::println);

    }
}
