package Algorithms.hacker_rank.implementations;

public class Staircase {

    static void staircase(int n) {

        int w = 0;
        int p = n-1;

        for (int i=0; i<n; i++){

            for (int j = 0; j < p; j++){
                System.out.print(" ");
            }

            for (int j=0; j<= w; j++){
                System.out.print("#");
            }

            System.out.println("");

            w++;
            p--;
        }
    }

    public static void main(String[] args) {
        staircase(4);
    }


}

