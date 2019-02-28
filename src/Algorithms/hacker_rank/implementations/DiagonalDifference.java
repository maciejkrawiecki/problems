package Algorithms.hacker_rank.implementations;

public class DiagonalDifference {

    // using 1d array

    static int diagonalDifference(int[][] arr) {

        int[] sequence = new int[arr.length * arr.length];

        int iterator = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                sequence[iterator] = arr[i][j];
                iterator++;
            }
        }

        int a = 0;
        int firstDiagonal = 0;

        firstDiagonal+= sequence[0];

        for (int i = 0; i < arr.length - 1; i++) {
            a += arr.length+1;
            firstDiagonal += sequence[a];
        }

        a = arr.length-1;
        int secondDiagonal = 0;

        secondDiagonal += sequence[arr.length-1];


        for (int i = 0; i< arr.length -1; i++){
            a += arr.length-1;
            secondDiagonal += sequence[a];
        }

        return Math.abs(firstDiagonal-secondDiagonal);
    }
}
