package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie63_3 {

    static boolean checkIfIsSemiPrimeNumber(String str) {

        int decNum = Integer.parseInt(str, 2);
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i <= decNum ; i++) {
            int counter = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) counter++;
            }

            if (counter == 2) primeNumbers.add(i);
        }

        for (int i=0; i<primeNumbers.size()  ; i++) {

            for (int j = 0; j < primeNumbers.size() ; j++){
                if (primeNumbers.get(i)*primeNumbers.get(j) == decNum) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "ciagi63.txt";
        List<String> strings = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    strings.add(line);
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

        List<Integer> halfPrimeNumber = new ArrayList<>();
        int counter = 0;
        for (int i =0; i<strings.size(); i++){

            if (checkIfIsSemiPrimeNumber(strings.get(i))){

                System.out.println(++counter);
                halfPrimeNumber.add(Integer.parseInt(strings.get(i),2));
            }
        }

        System.out.println(halfPrimeNumber);

    }
}
