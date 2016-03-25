package level1;

import functions.Factors;

import java.util.List;

/**
 *  https://projecteuler.net/problem=10
 **/

public class Problem10 {

    public static void main(String [] args){
        System.out.print(problem10());
    }

    public static long problem10(){
        List<Integer> primes = Factors.sieveOfEratosthenes(2000000);

        long sum=0;
        for(Integer i : primes){
            sum+=i;
        }

        return sum;
    }

}
