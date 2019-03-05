package Algorithms.hacker_rank.implementations;

public class FindDigit {

    public static int findDigit (int n){
        String strDigit = String.valueOf(n);
        int divs = 0;

        for (int i = 0; i < strDigit.length(); i++) {

            if (Character.getNumericValue(strDigit.charAt(i)) != 0 && n % Character.getNumericValue(strDigit.charAt(i)) == 0) {
                divs++;
            }
        }
        return divs;
    }
}
