package level1;

import java.math.BigInteger;

/**
 *  https://projecteuler.net/problem=20
 **/

public class Problem20 {

	public static void main (String [] args){
		BigInteger factorial= new BigInteger("1");

		Integer sum= 0;
		for(Integer i=1; i <=100; i++){
			factorial= factorial.multiply(new BigInteger(i.toString()));
		}
		
		for(int i = 0; i <factorial.toString().length(); i++){
			sum += Integer.parseInt(factorial.toString().substring(i, i+1));
		}
		System.out.println(sum);
	}
}
