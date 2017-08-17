package level3;

import functions.Factors;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=53
 * */

public class Problem53 {

	public static void main(String[] args){
	    System.out.print(problem53());
	}


    public static int problem53(){

        int count =0;
        BigInteger million = new BigInteger(String.valueOf(1000000));

        for(int n = 1; n<=100; n++){
            for(int r =1; r<=n; r++){

                BigInteger num = Factors.returnFactorialOfNum(n);
                BigInteger denom = Factors
                    .returnFactorialOfNum(r).multiply(Factors.returnFactorialOfNum(n-r));

                BigInteger combatoric = num.divide(denom);
                if(1 == combatoric.compareTo(million)){
                    count++;
                }
            }
        }

        return count;

    }
	
}

