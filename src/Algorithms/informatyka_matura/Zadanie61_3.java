package Algorithms.informatyka_matura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadanie61_3 {

    public static int findWrongNumberInString(String string) {

        List<Integer> numbers = new ArrayList<>();

        for (String n: string.split(" ")){
            numbers.add(Integer.valueOf(n));
        }

        int r=-1;

        for (int i=3; i<numbers.size(); i++) {

            if (numbers.get(i-2)-numbers.get(i-1) == numbers.get(i-1)-numbers.get(i-1)){
                r = numbers.get(i-2)-numbers.get(i-1);
                break;
            }
        }

        for (int i=2; i<numbers.size(); i++) {
            if (numbers.get(i-2)+r != numbers.get(i-1) && numbers.get(i-1)+r == numbers.get(i)){
                return numbers.get(i-2);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        BufferedReader bf = null;
        String nameOfFile = "bledne.txt";
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

        List<Integer> exeptions = new ArrayList<>();

        for (int i =0; i<strings.size(); i++) {
                if (findWrongNumberInString(strings.get(i))!= -1){
                    exeptions.add(findWrongNumberInString(strings.get(i)));
                }
        }

        System.out.println(exeptions);


    }
}
