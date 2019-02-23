package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie63_1 {

    static boolean isBicyclic (String str) {

        int lgth = str.length();
        String half1=str.substring(0,lgth/2);
        String half2=str.substring(lgth/2, lgth);

        return half1.equals(half2);

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

        List<String> filteredStrings = new ArrayList<>();

        for (int i =0; i<strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0) {
                if (isBicyclic(strings.get(i))) filteredStrings.add(strings.get(i));
            }
        }

        System.out.println(filteredStrings);
    }
}
