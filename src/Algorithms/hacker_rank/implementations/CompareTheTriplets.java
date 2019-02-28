package Algorithms.hacker_rank.implementations;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < a.size(); i++){
            if (a.get(i) > b.get(i)) aScore++;
            else if (a.get(i) < b.get(i)) bScore++;
        }

        List<Integer> scores = new ArrayList<>();
        scores.add(aScore);
        scores.add(bScore);
        return scores;
    }
}
