package Algorithms.hacker_rank.implementations;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (Math.abs(arr[i] - arr[j]) == d) {

                    for (int w = j + 1; w < arr.length; w++) {

                        if (Math.abs(arr[j] - arr[w]) == d) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        return count;
    }

}
