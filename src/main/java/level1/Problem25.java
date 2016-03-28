package level1;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=25
 **/

public class Problem25 {

	
	public static void main(String [] args){
		System.out.println(problem25());
	}
	

	public static int problem25(){

		BigInteger a;
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("3");

        int count =5;

        do{
			a=b;
			b=c;
			c=a.add(b);

			if(String.valueOf(c).length()>=1000){
                return count;
            }

            count++;

        }while(true);


	}

}
