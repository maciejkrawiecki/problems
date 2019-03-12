package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie61_2 {

    static int cubeMethod (String string) {

        List<Integer> cubesOfNumbers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();


        for (int i = 0; i<numbers.size(); i++) {
            for (int j = 0; j <=numbers.get(i); j++) {
                if (j*j > numbers.get(i)) {
                    break;
                }
                if (j*j*j == numbers.get(i)){
                    cubesOfNumbers.add(numbers.get(i));
                    break;
                }
            }
        }

        if (cubesOfNumbers.size()>0) return findMaxValue(cubesOfNumbers);
        return -1;
    }

    static int findMaxValue (List <Integer> numbers) {

        int max = numbers.get(0);

        for (int i =0; i<numbers.size();i++) {

            if (numbers.get(i) > max) max = numbers.get(i);
        }

        return max;
    }

    public static void main(String[] args) {
        BufferedReader bf = null;
        String nameOfFile = "ciagi.txt";
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

        List<Integer> maxCubesFromEachString = new ArrayList<>();

        for (int i = 1; i<strings.size(); i+=2) {

            if (cubeMethod(strings.get(i)) != -1) {
                maxCubesFromEachString.add(cubeMethod(strings.get(i)));
            }
        }

        System.out.println(maxCubesFromEachString);
    }

}
