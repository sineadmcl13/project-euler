package level1;

import functions.Factors;

import java.util.List;

/**
 *  * https://projecteuler.net/problem=10
 **/

public class Problem10 {

    public static void main(String [] args){

        List<Integer> primes = Factors.sieveOfEratosthenes(2000000);

        long sum=0;
        for(Integer i : primes){
            sum+=i;
        }

        System.out.print(sum);

    }
}
