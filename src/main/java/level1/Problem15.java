package level1;

import functions.Factors;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=15
 **/

public class Problem15 {

    public static void main(String [] args){
        System.out.println(problem15());
    }

    public static BigInteger problem15(){
        //formula = ( (2n)!/(n!)^2 )
        int num = 20;

        BigInteger numerator = Factors.returnFactorialOfNum(2*num);
        BigInteger denominator = Factors.returnFactorialOfNum(num).pow(2);
        return numerator.divide(denominator);
    }


}