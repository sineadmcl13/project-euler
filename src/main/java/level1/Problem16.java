package level1;

import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=16
 **/

public class Problem16 {

    public static void main(String [] args){
        System.out.println(problem16());
    }

    public static int problem16(){

        int sumOfDigits = 0;
        String fullNumber = new BigInteger("2").pow(1000).toString();

        for(int i =0; i<fullNumber.length(); i++){
            sumOfDigits+= Integer.valueOf(fullNumber.substring(i, i+1));
        }

        return sumOfDigits;
    }


}