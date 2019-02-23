package Algorithms.codility;

public class PassingCars {

    static int solution(int[] A){

        int counter=0;

        for (int i=0; i<A.length;i++) {

            for (int j=i; j<A.length; j++){
                if (A[i] < A[j]) counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int A[] = {0,1,0,1,1};
        System.out.println(solution(A));
    }
}
