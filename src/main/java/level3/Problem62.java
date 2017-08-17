package level3;

import functions.Permutations;
import java.math.BigInteger;

/**
 * https://projecteuler.net/problem=62
 */

public class Problem62 {


    public static void main(String [] args){
		System.out.println(problem62());
	}


	public static String problem62(){

        int maxNum = 8500;

        BigInteger[] cubedValue = new BigInteger [maxNum];
        for(int i = 0; i< maxNum; i++){

            BigInteger bigInti = new BigInteger(String.valueOf(i));
            BigInteger cube = bigInti.multiply(bigInti).multiply(bigInti);

            cubedValue[i] = cube;

        }

        for(int i = 0; i< maxNum; i++){
            int numberOfPermutations=1;
            for (int j = i+1; j< maxNum; j++){
                if(Permutations.isPermutation(cubedValue[i].toString(),cubedValue[j].toString())){
                    numberOfPermutations += 1;
                }

                if(numberOfPermutations==5){
                    return cubedValue[i].toString();
                }
            }

        }

        return "0";
    }



}

