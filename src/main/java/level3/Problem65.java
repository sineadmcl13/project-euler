package level3;

import functions.NumberUtils;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=65
 */

public class Problem65 {

	public static void main(String [] args){
		System.out.println(problem65());
	}


	public static int problem65(){

        int counter = 1;

        BigInteger two = new BigInteger("2");
        BigInteger numerator = new BigInteger("2");
        BigInteger prevNumerator = BigInteger.ONE;
        BigInteger secondPrevNumerator;

        for(int i = 1; i < 35; i++){

            BigInteger loopNum = new BigInteger(String.valueOf(i));
            for(int j = 1; j<=3; j++){

                BigInteger a= new BigInteger("1");
                if(j%2 == 0){
                    a=loopNum.multiply(two);
                }

                secondPrevNumerator=prevNumerator;
                prevNumerator=numerator;
                numerator = a.multiply(prevNumerator).add(secondPrevNumerator);

                counter++;

                if(counter == 100){
                    return NumberUtils.returnDigitSum(numerator.toString());
                }
            }

        }

        return 0;

    }


}

