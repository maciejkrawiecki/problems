package Algorithms.hacker_rank.implementations;

import java.util.ArrayList;
import java.util.List;

public class DesignerPDFviewer {

    static int designerPdfViewer(int[] h, String word) {

        int lengthOfWord = word.length();

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int maxHeight = 0;

        for (int i = h.length - 1; i >= 0; i--) {

            if (word.contains(String.valueOf(letters[i])) && h[i] > maxHeight) {
                maxHeight = h[i];
            }
        }
        return lengthOfWord * maxHeight;
    }

}
