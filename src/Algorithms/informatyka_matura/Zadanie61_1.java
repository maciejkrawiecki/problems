package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie61_1 {

    static int isAritmetic (String string) {

        List<Integer> numbers = new ArrayList<>();

        for (String n : string.split(" ")){
            numbers.add(Integer.valueOf(n));
        }

        boolean t = false;

        for (int i=3; i<numbers.size();i++) {
            if (numbers.get(i-2)-numbers.get(i-1) != numbers.get(i-1)-numbers.get(i)){
                t = false;
                return -1;
            }
        }

        return numbers.get(4) - numbers.get(3);
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


        int counter=0;
        List<Integer> difference = new ArrayList<>();

        for (int i =1; i<strings.size(); i+=2) {

            if (isAritmetic(strings.get(i)) != -1) {
                counter ++;
                difference.add(isAritmetic(strings.get(i)));
            }
        }

        System.out.println(counter);

        System.out.println(findMaxValue(difference));

    }
}
