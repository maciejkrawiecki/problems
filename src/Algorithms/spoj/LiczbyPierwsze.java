package Algorithms.spoj;

public class LiczbyPierwsze {

    public static String isPrime(int n){

        int div = 0;

        for (int i = 1; i<=n; i++){
            if (n % i == 0) div++;
            if (div > 2){
                break;
            }
        }

        if (div == 2) return "TAK";
        return "NIE";
    }


    public static void main(String[] args) {

        int n = 3;

            System.out.println(isPrime(11));
            System.out.println(isPrime(1));
            System.out.println(isPrime(4));

    }

}
