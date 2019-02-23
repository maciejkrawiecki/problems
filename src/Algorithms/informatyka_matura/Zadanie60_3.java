package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie60_3 {

    static List<Integer> calculateDividers (int number) {

        List<Integer> dividers = new ArrayList<>();

        for (int i = 1; i<= number; i++) {
            if (number % i == 0) dividers.add(i);
        }

        return dividers;
    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "liczby.txt";
        List<Integer> numbers = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    numbers.add(Integer.valueOf(line));
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

        List<List<Integer>> dividers = new ArrayList<>();

        for (int i=0; i<numbers.size(); i++) {
           dividers.add(calculateDividers(numbers.get(i)));
        }

        // NIE O TO CHYBA CHODZILO XD



    }
}
