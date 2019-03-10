package Algorithms.hacker_rank.implementations;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {

        int count = 0;

        while (s >= p && p >=m){
            s -= p;

            p -= d;
            count++;
        }

        while (s >= m && p <= m){
            s-= m;
            count++;
        }

        return count;
    }

}
