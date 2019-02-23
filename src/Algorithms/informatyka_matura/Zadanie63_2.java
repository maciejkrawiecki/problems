package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie63_2 {

    static boolean checkIfOnesAreNotNextToEachOther (String str) {

        for (int i = 1; i<str.length(); i++) {
            if (str.charAt(i)== '1' && str.charAt(i-1) == '1') return true;
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


        int counter = 0;


        for (int i =0; i<strings.size(); i++) {
        if (!checkIfOnesAreNotNextToEachOther(strings.get(i))) counter++;
        }

        System.out.println(counter);
    }
}
