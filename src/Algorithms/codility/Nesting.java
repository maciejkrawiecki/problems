package Algorithms.codility;

public class Nesting {

    static int solution (String s){
        int p = 0;
        int q = 0;

        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '(') p++;
            else if (s.charAt(i) == ')') q++;
        }

        if (p == q) return 1;
        else return 0;
    }
}
