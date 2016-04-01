package level2;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=48
 * */

public class Problem48 {

	public static void main (String[] args){
		System.out.print(problem48());
	}

	public static String problem48(){

        BigInteger sum = BigInteger.ZERO;

        for(int i=1; i<=1000; i++){

            BigInteger temp = BigInteger.valueOf(i).pow(i);
            sum=sum.add(temp);
        }

        String sumString = sum.toString();
        String lastDigits = sumString.substring(sumString.length()-10);

        return lastDigits;

    }



}
