package Algorithms.hacker_rank.implementations;

import java.util.Arrays;

public class HackerRankInAString {

    static String hackerrankInString(String s) {

        char[] letters = {'h', 'a', 'c', 'k', 'e', 'r', 'r','a','n','k'};
        int index = 0;

        for (int i=0; i<s.length();i++){
            if(s.charAt(i) == letters[index]){
                index++;

                if (index == 10) return "YES";
            }
        }

        return "NO";
    }

}
