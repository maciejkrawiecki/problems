package Algorithms.hacker_rank.warm_up;

public class RepeatedString {

    public static long solution(String s,long n){

        long substring = 0;
        long counter = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                substring++;
            }
        }
        long div = n / s.length();
        counter += div * substring;


        long rest = n % s.length();

        for(int i = 0; i < rest; i++)
        {
            if(s.charAt(i) == 'a')
            {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        //    System.out.println(solution("aba",1000000000000));

    }
}
