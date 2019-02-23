package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Zadanie74_2 {


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

        Set<String> set = new HashSet<>();

        for (int i=0; i<passwords.size(); i++) {

                for (int j = i; j<passwords.size(); j++){
                    if (passwords.get(i).equals(passwords.get(j))){
                        set.add(passwords.get(i));
                    }
                }
        }

        List<String> filteredPasswords = new ArrayList<>();

        filteredPasswords.addAll(set);

        for (int i=0; i<filteredPasswords.size(); i++){


            for (int j =0; j<passwords.size(); j++){
                if (filteredPasswords.get(i).equals(passwords.get(j))){
                    passwords.remove(j);
                    break;
                }
            }
        }
        System.out.println(passwords);
    }
}
