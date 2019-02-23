package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie60_2 {

    static boolean if18Dividers(int number) {

        int dividers = 0;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) dividers++;
        }
        if (dividers == 18) return true;

        return false;
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

        List<Integer> filteredNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {

            if (if18Dividers(numbers.get(i))) filteredNumbers.add(numbers.get(i));
        }

        for (int i = 0; i < filteredNumbers.size(); i++) {

            System.out.println(filteredNumbers.get(i));

            for (int j = 1; j <= filteredNumbers.get(i); j++) {
                if (filteredNumbers.get(i) % j == 0) System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
