package Algorithms.hacker_rank.implementations;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {

        int reversedNumber;
        int totalCount = 0;

        for (int x = i; x <= j; x++){

            StringBuilder str = new StringBuilder(String.valueOf(x));
            str.reverse();
            reversedNumber = Integer.valueOf(String.valueOf(str));

            if ((x - reversedNumber)%k == 0) totalCount++;
        }

        return totalCount;
    }

}
