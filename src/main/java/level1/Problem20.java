package level1;

import java.math.BigInteger;

/**
 *  https://projecteuler.net/problem=20
 **/

public class Problem20 {

	public static void main (String [] args){
        System.out.println(problem20());
    }

	public static int problem20(){
        BigInteger factorial= BigInteger.ONE;

        int sum= 0;
        for(int i=1; i <=100; i++){
            factorial= factorial.multiply(BigInteger.valueOf(i));
        }

        for(int i = 0; i <factorial.toString().length(); i++){
            sum += Integer.parseInt(factorial.toString().substring(i, i+1));
        }
        return sum;

    }

}
