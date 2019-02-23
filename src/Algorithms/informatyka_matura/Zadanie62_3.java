package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie62_3 {

    public static void main(String[] args) {

        BufferedReader bf = null;
        BufferedReader bf2 = null;
        String nameOfFile = "liczby1.txt";
        String nameOfFile2 = "liczby2.txt";
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        try {
            String line;
            String line2;
            bf = new BufferedReader(new FileReader(nameOfFile));
            bf2 = new BufferedReader(new FileReader(nameOfFile2));

            do {
                line = bf.readLine();
                line2 = bf2.readLine();
                if (line != null && line2 != null) {
                    numbers.add(Integer.valueOf(line));
                    numbers2.add(Integer.valueOf(line2));

                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

      int sameVerses = 0 ;

        for (int i=0; i<numbers.size(); i++){
            if (numbers.get(i) == numbers2.get(i)){
                sameVerses ++;
            }
        }

        int firstGreaterThanSecond = 0;

        for (int i=0; i<numbers.size();i++){
            if (numbers.get(i)> numbers2.get(i)){
                firstGreaterThanSecond ++;
            }
        }
        System.out.println(sameVerses);
        System.out.println(firstGreaterThanSecond);
    }
}
