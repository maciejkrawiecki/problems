package Algorithms.hacker_rank.implementations;

import java.util.Arrays;

public class FunnyString {

    static String funnyString(String s) {

        String s2 = "";

        for (int i = s.length() -1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }

        int[] differences = new int[s.length()-1];
        int[] differences2 = new int[s2.length()-1];

        for (int i = 1; i <s.length(); i++){
            differences[i-1] = Math.abs(s.charAt(i)-s.charAt(i-1));
            differences2[i-1] = Math.abs(s2.charAt(i)-s2.charAt(i-1));
        }

        if (Arrays.equals(differences,differences2)) return "Funny";
        return "Not Funny";

    }

}
