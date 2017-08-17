package level3;

import functions.Factors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * https://projecteuler.net/problem=69
 */

public class Problem69 {

	public static void main(String [] args){
		System.out.println(problem69());
	}

	public static int problem69(){
		List<Integer> primeList = new ArrayList<>();
		primeList.add(0);
		primeList.add(1);
		primeList.addAll(Factors.sieveOfEratosthenes(1000000));

		int maxN=0;
		double maxTotient=0;

		for(int i =4; i<1000000; i++){
			if(!Factors.isPrime(i)){
				Set<Double> primeFactors = Factors.returnPrimeFactors(i, primeList);
				double totient=0;
				double numRelativelyPrime = i;

				for(Double j : primeFactors){
					numRelativelyPrime = numRelativelyPrime*(1-(1/j));
				}

				totient= i/numRelativelyPrime;

				if(totient>maxTotient){
					maxTotient=totient;
					maxN=i;
				}

			}
		}

		return maxN;
    }





}

