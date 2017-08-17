package level3;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=57
 */

public class Problem57 {

	public static void main(String [] args){
		System.out.println(problem57());
	}


	public static int problem57(){
        int count = 0;

        BigInteger numerator =  new BigInteger(String.valueOf(3));
        BigInteger denominator =  new BigInteger(String.valueOf(2));
        BigInteger temp;

        for(int i = 2; i <= 1000; i++){
            temp = denominator;
            denominator = numerator.add(denominator);
            numerator = denominator.add(temp);

            if(numerator.toString().length() > denominator.toString().length()){
                count++;
            }

        }
        return count;
    }


}

