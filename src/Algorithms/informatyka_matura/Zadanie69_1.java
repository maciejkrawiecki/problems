package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanie69_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = null;
        String nameOfFile = "dane_geny.txt";
        List<String> genes = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    genes.add(line);
                }
            } while (line != null);

        } catch (IOException ex){
            ex.getMessage();
        }


        Set<Integer> set = new HashSet<>();

        for (int i=0; i<genes.size(); i++) {

            set.add(genes.get(i).length());
        }

        System.out.println(set.size());


        List<String> filteredList = new ArrayList<>();
        List<Integer> iteratorList = new ArrayList<>();

        int p=0;
        String current;

        int [] tab = new int[207];


        do {
            boolean t = true;
            current = genes.get(p);

            for (int i=0; i<filteredList.size(); i++) {
                if (current.length() == (filteredList.get(i).length())){
                    t = false;

                    break;
                }
            }
            p++;
            if (t) filteredList.add(current);

        } while (p<genes.size());


        System.out.println(filteredList.size());

        for (int i=0; i<filteredList.size(); i++){

            for (int j=0; j<genes.size(); j++) {
                if (filteredList.get(i).length() ==genes.get(j).length()){
                    tab[i] ++;
                }
            }
        }
        int max = 0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i]>max) max = tab[i];
        }

        System.out.println(max);
        int counter = 0;
        for (int i = 0; i < filteredList.size(); i++) {
            if (filteredList.get(i).contains("BCDDC")) counter++;
        }

        System.out.println(counter);
    }
}
