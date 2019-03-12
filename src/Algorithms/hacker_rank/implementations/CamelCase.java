package Algorithms.hacker_rank.implementations;

public class CamelCase {

    static int camelcase(String s) {
        if (s.length() == 0) return 0;
        int words = 1;
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c)) words++;
        }
        return words;
    }
}
