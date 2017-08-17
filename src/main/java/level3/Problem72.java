package level3;

import functions.Factors;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * https://projecteuler.net/problem=72
 */

public class Problem72 {

	public static void main(String [] args){
		System.out.println(problem72());
	}


	public static String problem72(){

        BigInteger numberOfFractions = BigInteger.ZERO;

        List<Integer> primeList = new ArrayList<>();
        primeList.add(0);
        primeList.add(1);
        primeList.addAll(Factors.sieveOfEratosthenes(1000000));

        for(int i =2; i<=1000000; i++){
            double numRelativelyPrime = i;
            if(!Factors.isPrime(i)){
                Set<Double> primeFactors = Factors.returnPrimeFactors(i, primeList);

                for(Double j : primeFactors){
                    numRelativelyPrime = numRelativelyPrime*(1-(1/j));
                }
                numberOfFractions=numberOfFractions.add(new BigInteger(String.valueOf((int)numRelativelyPrime)));

            }else{
                numRelativelyPrime =i-1;
                numberOfFractions=numberOfFractions.add(new BigInteger(String.valueOf((int)numRelativelyPrime)));

            }
        }

        return  numberOfFractions.toString();
    }


}

