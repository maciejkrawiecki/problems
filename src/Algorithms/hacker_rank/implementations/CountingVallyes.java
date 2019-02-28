package Algorithms.hacker_rank.implementations;

public class CountingVallyes {

    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();

        int level = 0;
        int counter = 0;

        boolean in = false;

        for (int i = 0; i < steps.length; i++){
            if (steps[i] == 'U') level++;
            else if (steps[i] == 'D') level--;

            if (level < 0){
                in = true;
            }
            else if (level >=0 && in){
                counter++;
                in = false;
            }
        }

        return counter;

    }
}
