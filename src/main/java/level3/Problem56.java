package level3;

import functions.NumberUtils;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=56
 */

public class Problem56 {

	public static void main(String [] args){
		System.out.println(problem56());
	}


	public static int problem56(){
        int maxSum=0;

        for(int i=1; i<100; i++){
            for (int j=1; j<100; j++){
                BigInteger a = new BigInteger(String.valueOf(i));

                BigInteger power = a.pow(j);

                int temp = NumberUtils.returnDigitSum(String.valueOf(power));

                if(temp>maxSum){
                    maxSum = temp;
                }

            }
        }

        return maxSum;
    }


}

