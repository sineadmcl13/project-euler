package level3;

import functions.Palindrone;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=55
 */

public class Problem55 {

	public static void main(String [] args){
		System.out.println(problem55());
	}


	public static int problem55(){
        int lychrelNums= 0;

        nextNum:
        for(Integer i =10; i<10000; i++){
            BigInteger original = new BigInteger(i.toString());
            BigInteger reverse = new BigInteger(Palindrone.reverseString(original.toString()));
            BigInteger sum = original.add(reverse);

            for(int j =1; j<=50; j++){

                if(Palindrone.isPalindromic((sum.toString()))){
                    continue nextNum;
                }
                else{
                    original=sum;
                    reverse = new BigInteger(Palindrone.reverseString(original.toString()));
                    sum = original.add(reverse);
                }

            }

            lychrelNums++;

        }

        return lychrelNums;
    }
	
}

