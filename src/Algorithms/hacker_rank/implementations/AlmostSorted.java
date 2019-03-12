package Algorithms.hacker_rank.implementations;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlmostSorted {

    static void almostSorted(int[] arr) {

        int indexOfFirstNumberToSwap = 0, indexOfSecondNumberToSwap = 0;

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        int differences = 0;
        int arrIndexOfFirstDifference = -1;
        int arrIndexOfLastDifference;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sortedArr[i]) {
                differences++;

                if (differences == 1) {
                    arrIndexOfFirstDifference = i;
                    indexOfFirstNumberToSwap = i + 1;
                } else if (differences == 2) {
                    indexOfSecondNumberToSwap = i + 1;
                }
            }
        }

        if (differences == 2) {
            System.out.println("yes");
            System.out.println("swap " + indexOfFirstNumberToSwap + " " + indexOfSecondNumberToSwap);
        } else {

            arrIndexOfLastDifference = arrIndexOfFirstDifference + differences - 1;
            List<Integer> reversed = new ArrayList<>();
            int[] arrPartlyReversed = arr.clone();


            for (int i = arrIndexOfFirstDifference; i <= arrIndexOfLastDifference; i++) {
                reversed.add(arr[i]);
            }

            Collections.reverse(reversed);
            int iterator = 0;

            for (int i = arrIndexOfFirstDifference; i <= arrIndexOfLastDifference; i++) {
                arrPartlyReversed[i] = reversed.get(iterator);
                iterator++;
            }

            boolean sortedEqualsArrPartlyReversed = true;

            for (int i = 0; i < sortedArr.length; i++) {
                if (sortedArr[i] != arrPartlyReversed[i]) {
                    sortedEqualsArrPartlyReversed = false;
                    break;
                }
            }

            if (sortedEqualsArrPartlyReversed) {
                System.out.println("yes");
                System.out.println("reverse " + arr[arrIndexOfLastDifference] + " " + arr[arrIndexOfFirstDifference]);
            } else System.out.println("no");
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2 ,3, 5,4,9,1};
        almostSorted(A);
    }
}
