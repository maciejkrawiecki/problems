package Algorithms.hacker_rank.warm_up;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static boolean solution (String s1, String s2){

        Set<Character> word1 = new HashSet<>();
        Set<Character> word2 = new HashSet<>();

        s1.chars().mapToObj(i -> (char)i).forEach(word1::add);
        s2.chars().mapToObj(i -> (char)i).forEach(word2::add);

        boolean t = word1.stream().anyMatch(word2::contains);

        return t;

    }

    public static void main(String[] args) {

        System.out.println(solution("hello","e"));

    }
}
