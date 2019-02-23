package Algorithms.informatyka_matura;

import java.util.ArrayList;
import java.util.List;

public class EmptyClass {

    static boolean checkIfIsSemiFirstNumber(String str) {

        int decNum = Integer.parseInt(str, 2);

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i <= decNum ; i++) {
            int counter = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) counter++;
            }

            if (counter == 2) primeNumbers.add(i);
        }

        for (int i=0; i<primeNumbers.size(); i++) {

            for (int j = 0; j < primeNumbers.size() ; j++){
                if (primeNumbers.get(i)*primeNumbers.get(j) == decNum) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "1100101";

        System.out.println(checkIfIsSemiFirstNumber(str));

    }
}
