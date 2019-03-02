package Algorithms.hacker_rank.implementations;

public class CatsAndMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        int a = Math.abs(z - x);
        int b = Math.abs(z - y);

        if (a < b) return "Cat A";
        if (a > b) return "Cat B";
        else return "Mouse C";

    }
}
