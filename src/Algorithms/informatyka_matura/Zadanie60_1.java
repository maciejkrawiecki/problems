package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie60_1 {

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


        for (int i =0; i<numbers.size(); i++) {

            if (numbers.get(i) < 1000) filteredNumbers.add(numbers.get(i));
        }

        System.out.println(filteredNumbers.size());
        System.out.println(filteredNumbers.get(filteredNumbers.size()-1));
        System.out.println(filteredNumbers.get(filteredNumbers.size()-2));


    }
}
