package Algorithms.hacker_rank.warm_up;

public class RotationLeft {

    public static int[] rotation(int[] A, int n) {

        int k = n;

        if (k >= A.length) {
            k %= A.length;
        }

        if (k == 0) return A;

        int [] rotated = new int[A.length];

        int counter = 0;

        for (int i = 0; i <= A.length - k - 1; i++) {
            rotated[i] = A[i+k];
            counter++;
        }

        for (int i = 0; i <= A.length - counter - 1; i++){
            rotated[i+counter] = A[i];
        }


        return rotated;
    }

    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        rotation(A,4);
    }

}