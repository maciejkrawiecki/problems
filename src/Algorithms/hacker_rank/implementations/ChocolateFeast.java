package Algorithms.hacker_rank.implementations;

public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {

        int bars = 0;
        int wrappers = 0;

        if (n > c) {
            bars += n / c;
            wrappers += bars;

            while (wrappers >= m) {
                wrappers -= m;
                bars++;
                wrappers++;
            }
        }
        return bars;
    }
}
