package Algorithms.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MissingInteger {

    static int solution(int[] A) {

        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

        if (list.stream().allMatch(a -> a < 0)) return 1;

        List<Integer> positiveNumbers = list.stream().filter(a -> a > 0).collect(Collectors.toList());
        List<Integer> filteredNumbers = new ArrayList<>();

        for (int element : positiveNumbers) {
            if (!filteredNumbers.contains(element)) {
                filteredNumbers.add(element);
            }
        }

        Collections.sort(filteredNumbers);

        for (int i = 0; i < filteredNumbers.size(); i++) {
            if (filteredNumbers.get(i) != i + 1) return i + 1;
        }

        return filteredNumbers.size() + 1;
    }

    public static void main(String[] args) {
        int A[] = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
}
