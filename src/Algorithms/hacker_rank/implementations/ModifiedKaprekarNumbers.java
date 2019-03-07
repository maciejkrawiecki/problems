package Algorithms.hacker_rank.implementations;

public class ModifiedKaprekarNumbers {


    static void kaprekarNumbers(int p, int q) {

        for (int i = p; i <= q; i++) {

            if (i == 1) {
                System.out.print(i + " ");
                continue;
            }

            int squareOfCurrentNumber = i * i;
            int count_digits = 0;
            while (squareOfCurrentNumber != 0) {
                count_digits++;
                squareOfCurrentNumber /= 10;
            }

            squareOfCurrentNumber = i * i;


            for (int j = 1; j < count_digits; j++) {
                int parts = (int) Math.pow(10, j);


                if (parts == i)
                    continue;

                int sum = squareOfCurrentNumber / parts + squareOfCurrentNumber % parts;
                if (sum == i)
                    System.out.print(i + " ");
            }
        }
    }



}
