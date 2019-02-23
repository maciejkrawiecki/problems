package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie62_4 {

    static int amountOfSix(List<String> numbers) {

        int counter = 0;

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.get(i).length(); j++) {
                if (numbers.get(i).charAt(j) == '6') {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "liczby2.txt";
        List<String> numbers = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    numbers.add(line);
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

        List<Integer> decNumbers = numbers.stream().map(n -> Integer.valueOf(n)).collect(Collectors.toList());
        List<String> octalNumbers = decNumbers.stream().map(s -> Integer.toOctalString(s)).collect(Collectors.toList());

        System.out.println(amountOfSix(numbers));
        System.out.println(amountOfSix(octalNumbers));
    }
}
