package Algorithms.hacker_rank.implementations;

public class DrawingBook {

    static int pageCount(int n, int p) {


        if (p <= n / 2) {

            int actualPage = 1;

            for (int i = 0; i < n / 2; i++) {

                if (actualPage == p || actualPage - 1 == p)
                    return i;
                actualPage += 2;
            }
        } else {

            int actualPage = n;

            for (int i = 0; i < n / 2; i++) {



                if (actualPage == p && i == 0) return 0;
                if (actualPage-1 == p && i == 0 && n % 2 == 0) return 1;
                if (actualPage == p  || actualPage - 1 == p && i > 0) {
                    return i;
                }
                actualPage -= 2;
            }
        }

        return 0;

    }


    public static void main(String[] args) {

        System.out.println(pageCount(6, 5));
    }
}


// 1 2 3 4 5 6

// 6
// 2

// 1