package Algorithms.codility;

public class BinaryGap {

    public static int oddArraySolution(int[] A) {
        int element = 0;

        for (int i = 0; i < A.length; i++) {
            element ^= A[i];
        }
        return element;
    }

    public static void main(String[] args) {


        int A[] = {1,1,2,2,3,3,7,7,7};
        System.out.println(oddArraySolution(A));

    }
}
