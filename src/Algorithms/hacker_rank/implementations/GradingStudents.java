package Algorithms.hacker_rank.implementations;

public class GradingStudents {

    public static int[] solution (int[] grades){

        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {

            boolean t = true;
            for (int j = 1; j < 3; j++) {
                if ((grades[i] + j) % 5 == 0 && grades[i] + j >= 40) {
                    roundedGrades[i] = grades[i] + j;
                    t = false;
                    break;
                }
            }

            if (t) roundedGrades[i] = grades[i];
        }

        return roundedGrades;
    }
}
