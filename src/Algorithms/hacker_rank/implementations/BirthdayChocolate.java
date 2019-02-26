package Algorithms.hacker_rank.implementations;

import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {

        int checks = s.size() - m ;

        int totalCount = 0;


        for (int i = 0; i <= checks; i++){
            int sum = 0;

            for (int j = i ; j <= m-1; j++){
                sum += s.get(j);
            }

            if (sum == d) totalCount++;
            m++;
        }

        return totalCount;

    }
}
