package level3;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=66
 */

public class Problem66 {

	public static void main(String [] args){
		System.out.println(problem66());
	}


	public static int problem66(){

        BigInteger one = BigInteger.ONE;

        BigInteger maxNumerator = BigInteger.ZERO;
        int maxD =0;

        for(int i =1; i<1000; i++){

            if(Math.sqrt(i)!=(int)Math.sqrt(i)){

                int m = 0;
                int d = 1;
                int a = (int) Math.sqrt(i);

                BigInteger numerator = new BigInteger(String.valueOf(a));
                BigInteger prevNumerator = BigInteger.ONE;
                BigInteger secondPrevNumerator;

                BigInteger denominator = BigInteger.ONE;
                BigInteger prevDenominator = BigInteger.ZERO;
                BigInteger secondPrevDenominator;

                BigInteger bigI = new BigInteger(String.valueOf(i));


                while(!one.equals(numerator.multiply(numerator).subtract(bigI.multiply(denominator.multiply(denominator))))){

                    m = d*a-m;
                    d = (i-(m*m))/d;
                    a = (int)(Math.sqrt(i)+m)/d;

                    BigInteger tempA = new BigInteger(String.valueOf(a));

                    secondPrevNumerator=prevNumerator;
                    prevNumerator=numerator;
                    numerator = tempA.multiply(prevNumerator).add(secondPrevNumerator);

                    secondPrevDenominator=prevDenominator;
                    prevDenominator=denominator;
                    denominator = tempA.multiply(prevDenominator).add(secondPrevDenominator);

                }

                if(numerator.compareTo(maxNumerator)==1){
                    maxNumerator=numerator;
                    maxD = i;

                }

            }

        }

        return maxD;

    }


}

