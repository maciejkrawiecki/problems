package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Zadanie74_3 {

    static boolean chcekLetters (char letter1, char letter2, char letter3, char letter4) {

        char max = letter1;
        char min = letter1;

        if (letter2 > max) max = letter2;
        if (letter2 < max) min = letter2;

        if (letter3 > max) max = letter3;
        if (letter3 < max) min = letter3;

        if (letter4 > max) max = letter4;
        if (letter4 < max) min = letter4;


        if (java.lang.Math.abs(max-min) < 4) return true;
        return false;


    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "hasla.txt";
        List<String> passwords = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    passwords.add(line);
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }


        int counter = 0;
        for (int i=0; i< passwords.size(); i++) {

            for (int j=3; j<passwords.get(i).length(); j++){
                if (chcekLetters(passwords.get(i).charAt(j-3),
                        passwords.get(i).charAt(j-2),
                        passwords.get(i).charAt(j-1),
                        passwords.get(i).charAt(j)
                )) {
                    counter++;
                    break;
                }
            }
        }

        System.out.println(counter);

    }
}
