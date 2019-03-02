package Algorithms.hacker_rank.implementations;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

        // too slow answer

        int[] arr = new int[n];

        // 0 0 0 0 0

        //

        int iterator = 0;

        for (int i = 0; i < queries.length; i++) {

            for (int j = queries[i][iterator]-1; j <= queries[i][iterator+1]-1; j++){
                arr[j] += queries[i][iterator+2];
            }
        }

        int max = arr[0];

        for (int i =0; i<arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }


        return max;
    }



    public static void main(String[] args) {

        int[][] A = new int[3][3];

        A[0][0] = 1;
        A[0][1] = 2;
        A[0][2] = 100;
        A[1][0] = 2;
        A[1][1] = 5;
        A[1][2] = 100;
        A[2][0] = 3;
        A[2][1] = 4;
        A[2][2] = 100;


        System.out.println(arrayManipulation(5,A));

    }


}
