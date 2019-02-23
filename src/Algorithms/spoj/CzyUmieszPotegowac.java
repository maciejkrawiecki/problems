package Algorithms.spoj;

import static java.lang.Math.pow;

public class CzyUmieszPotegowac {

    public static int solution(int p, int w) {
        int result;
        p %= 10;

        if (w != 0) {
            switch (w % 4) {
                case 0:
                    w = 4;
                    break;
                case 1:
                    w = 1;
                    break;
                case 2:
                    w = 2;
                    break;
                case 3:
                    w = 3;
                    break;
            }
        }

        result =  (int) pow(p,w)%10;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 3));
        System.out.println(solution(3, 3));
    }
}