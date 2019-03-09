package Algorithms.hacker_rank.implementations;

import java.time.LocalDateTime;

public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        LocalDateTime returned = LocalDateTime.of(y1,m1,d1,1,1,1);
        LocalDateTime expected = LocalDateTime.of(y2,m2,d2,2,2,2);

        if (returned.isBefore(expected)) return 0;

        if (returned.getMonth() == expected.getMonth() && returned.getYear() == expected.getYear())
            return 15*(returned.getDayOfMonth() - expected.getDayOfMonth());

        if (returned.getMonth() != expected.getMonth() && returned.getYear() == expected.getYear())
            return 500*(returned.getMonthValue()-expected.getMonthValue());

            return 10000;
    }

}
