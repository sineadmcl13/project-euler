package level1;

import functions.Permutations;

/**
 * https://projecteuler.net/problem=24
 **/

public class Problem24 {

	
	public static void main(String [] args){
		System.out.println(problem24());
	}
	

	public static String problem24(){

		char [] numbers = {0,1,2,3,4,5,6,7,8,9};

		for(int i=2; i<=1000000; i++){
			Permutations.nextPermutation(numbers);
		}

		String num = "";
		for (char j : numbers){
			num+=(int)j;
		}
		return num;

	}

}
