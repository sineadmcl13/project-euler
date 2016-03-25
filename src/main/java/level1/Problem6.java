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
        BigInteger sumOfSquares = new BigInteger("0");
        long sum = 0;
        for(int i=1 ; i<=100; i++){
            sum+=i;
            String square = String.valueOf(i*i);
            sumOfSquares=sumOfSquares.add(new BigInteger(square));
        }

        BigInteger squareOfSum = new BigInteger(String.valueOf(sum));
        squareOfSum = squareOfSum.multiply(squareOfSum);

        return squareOfSum.subtract(sumOfSquares);
    }
}
