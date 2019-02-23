package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie62_1 {

    static int finMaxValue (List<Integer> numbers) {

        int max = numbers.get(0);

        for (int i =0; i<numbers.size(); i++) {
            if (numbers.get(i) > max) max = numbers.get(i);
        }

        return max;
    }

  static int finMinValue (List<Integer> numbers) {

        int min = numbers.get(0);

        for (int i =0; i<numbers.size(); i++) {
            if (numbers.get(i) < min) min = numbers.get(i);
        }

        return min;
    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "liczby1.txt";
        List<Integer> decimalNumbers = new ArrayList<>();

        try {
            String line;
            bf = new BufferedReader(new FileReader(nameOfFile));

            do {
                line = bf.readLine();
                if (line != null) {
                    decimalNumbers.add(Integer.parseInt(line,8));
                }
            } while (line != null);

        } catch (IOException ex) {
            ex.getMessage();
        }

        String octalMax = Integer.toOctalString(finMaxValue(decimalNumbers));
        String octalMin = Integer.toOctalString(finMinValue(decimalNumbers));

        System.out.println("max: " + octalMax);
        System.out.println("min: " + octalMin);



    }
}

/*


 */