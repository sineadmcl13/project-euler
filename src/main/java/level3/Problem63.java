package level3;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=63
 */

public class Problem63 {

	public static void main(String [] args){
		System.out.println(problem63());
	}


	public static int problem63(){

        int count=0;

        BigInteger nine = new BigInteger("9");

        for(int i =1; ; i++){

            /*
               i^10 will always be 1 digit more than the number
               e.g 1^10=10 so if length of i^9 !=9 then no more answers should exist
             */

            if(nine.pow(i).toString().length()!=i){
                break;
            }

            for(int j=1; ; j++){

                BigInteger temp = new BigInteger(String.valueOf(j));
                BigInteger pow = temp.pow(i);

                if(pow.toString().length()==i){
                    count++;
                }
                else if (pow.toString().length()>i) break;


            }

        }

        return count;

    }


}

