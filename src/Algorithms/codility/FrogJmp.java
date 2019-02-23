package Algorithms.codility;

public class FrogJmp {

    static int solution (int currentLocation, int destination, int rangeOfJump) {

        int numberOfJumps = 0;

        while (currentLocation < destination){
            currentLocation+=rangeOfJump;
            numberOfJumps++;
        }

        return numberOfJumps;
    }

    public static void main(String[] args) {

        System.out.println(solution(10,85,30));
    }
}
