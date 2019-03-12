package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        BufferedReader bf = null;
        String nameOfFile = "ciagi.txt"; // nazwa pliku
        List<String> strings = new ArrayList<>(); // lista do której bede dodawal

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine(); // wczytuje wiersz i przypisuje go do line
                if (line != null) {
                    for (String s: line.split(",")){
                        strings.add(s);
                    }
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

    }
}
