package Algorithms.codility;

public class Triangle {

    static int solution(int[] A) {

        for (int i = 0; i < A.length; i++) {

            for (int j = i+1; j < A.length; j++) {

                for (int w = j +1; w< A.length; w++){

                    if (A[i] + A[j] > A[w] && A[j] + A[w] > A[i] && A[i] + A[w] > A[j]){
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] A1 = {10,50,5,1};
        int[] A2= {10,2,5,1,8,20};
        System.out.println(solution(A1));
        System.out.println(solution(A2));

    }
}
