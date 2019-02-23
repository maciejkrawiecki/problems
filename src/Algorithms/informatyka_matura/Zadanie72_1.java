package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie72_1 {

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "text.txt";
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


    }
}
