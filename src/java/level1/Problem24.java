package level1;

import functions.Permutations;

import java.util.List;

/**
 * https://projecteuler.net/problem=24
 **/

public class Problem24 {

	
	public static void main(String [] args){

		long startTime = System.currentTimeMillis();

		char [] numbers = {0,1,2,3,4,5,6,7,8,9};

		for(int i=2; i<=1000000; i++){
			Permutations.nextPermutation(numbers);
		}

		for (char j : numbers){
			System.out.print((int)j);
		}
		System.out.println();

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime*0.001+" secs");
	}
	
	
}
