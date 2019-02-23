package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie74_1 {

    static boolean checkIfPasswordContainsOnlyDigits (String pass) {

        char [] characters = pass.toCharArray();

        for (int i =0; i < characters.length;i++) {
            if (characters[i] < 48 || characters[i] > 57) return false;
        }

        return true;
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

        for (int i = 0; i<passwords.size(); i++) {

            if (checkIfPasswordContainsOnlyDigits(passwords.get(i))) counter ++;
        }

        System.out.println(counter);
    }
}
