package level1;

import functions.Factors;

import java.util.HashSet;
import java.util.Set;

/**
 * https://projecteuler.net/problem=21
 **/

public class Problem21 {

	public static void main (String [] args){
		System.out.println(problem21());
	}

	public static int problem21(){

		Set<Integer> amicableNumbers = returnAmicableNumbers();

		int sum=0;
		for(int i: amicableNumbers){
			sum+=i;
		}

		return sum;

	}

	private static Set<Integer> returnAmicableNumbers(){
		Set<Integer> amicableNumbers = new HashSet<Integer>();
		for(int i=200; i<=10000; i++){
			int k=0;
			for(int j : Factors.returnFactors(i)){
				k+=j;
			}

			if(k>1){
				int m=0;
				for (int p : Factors.returnFactors(k)){
					m+=p;
				}

				if(i==m){
					//check that i ≠ k
					if(!(i==k)){
						amicableNumbers.add(i);
					}
				}
			}
		}

		return amicableNumbers;
	}

}
