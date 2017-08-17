package level3;

import functions.Factors;
import functions.Permutations;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * https://projecteuler.net/problem=70
 */

public class Problem70 {

	public static void main(String [] args){
		System.out.println(problem70());
	}


	public static int problem70(){

        List<Integer> primeList = new ArrayList<>();
        primeList.add(0);
        primeList.add(1);
        primeList.addAll(Factors.sieveOfEratosthenes(1000000));

        double minRatio=2;
        int minRatioNum=0;

        for(int i =4; i<10000000; i++){
            if(!Factors.isPrime(i)){
                Set<Double> primeFactors = Factors.returnPrimeFactors(i, primeList);
                double numRelativelyPrime = i;

                for(Double j : primeFactors){
                    numRelativelyPrime = numRelativelyPrime*(1-(1/j));
                }

                if(Permutations.isPermutation(i, (int)numRelativelyPrime)){
                    if(i/numRelativelyPrime < minRatio){
                        minRatio=i/numRelativelyPrime;
                        minRatioNum=i;
                    }
                }

            }
        }

        return minRatioNum;

    }



}

