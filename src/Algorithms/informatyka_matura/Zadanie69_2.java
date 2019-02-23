package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie69_2 {

    static boolean checkIfLetterHasTheSameNeighbour(String sentence, int index, char letter) {

        return sentence.charAt(index) == letter && sentence.charAt(index + 1) == letter;
    }

    public static void main(String[] args) {
        BufferedReader bf = null;
        String nameOfFile = "dane_geny.txt";
        List<String> geneotypes = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    geneotypes.add(line);
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

        List<String> genes = new ArrayList<>();

        for (int i = 0; i < geneotypes.size(); i++) {

            int AAindex = -1;
            int BBindex;

            for (int j = 0; j < geneotypes.get(i).length(); j++) {

                if (AAindex == -1 && checkIfLetterHasTheSameNeighbour(geneotypes.get(i), j, 'A')) {
                    AAindex = j;
                }

                if (AAindex != -1 && checkIfLetterHasTheSameNeighbour(geneotypes.get(i), j, 'B')) {
                    BBindex = j + 2;
                    genes.add(geneotypes.get(i).substring(AAindex, BBindex));
                    System.out.println(genes); // <- wypisanie aktualnej listy genów
                    AAindex = -1;
                }
            }
        }
    }
}
