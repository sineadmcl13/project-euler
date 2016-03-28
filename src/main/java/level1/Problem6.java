package level1;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=6
 **/

public class Problem6 {

    public static void main(String [] args){
        System.out.println(problem6());
    }


    public static BigInteger problem6(){
        BigInteger sumOfSquares = BigInteger.ZERO;
        long sum = 0;
        for(int i=1 ; i<=100; i++){
            sum+=i;
            sumOfSquares=sumOfSquares.add(BigInteger.valueOf(i*i));
        }

        BigInteger squareOfSum = BigInteger.valueOf(sum);
        squareOfSum = squareOfSum.multiply(squareOfSum);

        return squareOfSum.subtract(sumOfSquares);
    }
}
