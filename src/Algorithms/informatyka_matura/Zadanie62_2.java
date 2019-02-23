package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Zadanie62_2 {

    static List<Integer> findMaxSize(List<List<Integer>> list) {

        int max = list.get(0).size();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).size() > max) {
                max = list.get(i).size();
                index = i;
            }
        }

        return list.get(index);
    }

    static boolean checkIfNextNumberIsGreaterOrEqualThanThePreviousOne(int first, int second) {
        return second > first;
    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "liczby2.txt";
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

        List<Integer> sizes = new ArrayList<>();

        List<List<Integer>> stringList = new ArrayList<>();

        for (int i = 1; i < numbers.size(); i++) {

            int counter = 1;
            while (checkIfNextNumberIsGreaterOrEqualThanThePreviousOne(numbers.get(i - 1), numbers.get(i))) {
                counter++;

                if (i == numbers.size() - 1) break;
                i++;
            }

            if (counter > 1) {
                sizes.add(counter);
                int w = i - counter;
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < counter; j++) {
                    temp.add(numbers.get(w));
                    w++;
                }

                stringList.add(temp);
            }
        }

        System.out.println(sizes);
        System.out.println(findMaxSize(stringList));


    }
}
