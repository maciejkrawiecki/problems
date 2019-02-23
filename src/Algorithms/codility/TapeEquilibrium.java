package Algorithms.codility;

public class TapeEquilibrium {

    static int solution(int[] A) {


        int[] P = new int[A.length - 1];

        int counter = 0;

        for (int i = 0; i < P.length; i++) {

            int p = 0;
            int q = 0;

            for (int j = 0; j <= counter; j++) {
                p += A[j];
            }

            counter++;

            for (int j = counter; j < A.length; j++) {
                q += A[j];
            }

            P[i] = p - q;
            if (P[i] < 0) P[i] *= (-1);
        }

        return findMin(P);
    }

    static int findMin(int[] A) {

        int min = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) min = A[i];
        }

        return min;
    }

    public static void main(String[] args) {

        int[] A = {3, 1, 2, 4, 3};

        System.out.println(solution(A));

    }
}
