package Algorithms.hacker_rank.implementations;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {


        int[] result = new int[queries.length];


        for (int i = 0; i < queries.length; i++) {

            for (int j = 0; j < strings.length; j++) {

                if (queries[i].equals(strings[j])){
                    result[i]++;
                }
            }
        }

    return result;
    }
}
