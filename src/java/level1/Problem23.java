package level1;

import functions.Factors;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=23
 **/

public class Problem23 {

	public static void main(String [] args){

		//holds the list of abundant numbers
		ArrayList<Integer> listOfAbundants = new ArrayList<Integer>();
		
		//holds the numbers that can't be written as the sum of two abundant numbers
		ArrayList<Integer> notSumOfAbundants = new ArrayList<Integer>();
		
		for (int i=11; i<28123; i++){
			ArrayList<Integer> factors = Factors.returnFactors(i);
			int sumOfFactors=0;
			for(long j : factors){
				sumOfFactors+=j;
			}
			if(sumOfFactors>i){
				listOfAbundants.add(i);
			}
		}
		
		
		//for each number under 28123 check if it can be written as the sum as two abundant sums
		checkNumber:
		for (int i = 28123; i >0; i--){
			//iterate though list of abundant numbers
			//check if i - abundant number = another abundant number in list
			//if it does then it can be written as the sum of 2 abundant numbers
			for(int j: listOfAbundants){
				if(listOfAbundants.contains(i-j)){
					continue checkNumber;
				}			
			}
			notSumOfAbundants.add(i);						
		}
			
		int sum = 0;
		for(int i: notSumOfAbundants){
			sum +=i;
		}
		
		System.out.println(sum);

	}
	
}
