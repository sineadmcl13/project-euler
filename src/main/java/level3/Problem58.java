package level3;

import functions.Factors;

/**
 * https://projecteuler.net/problem=58
 */

public class Problem58 {

	public static void main(String [] args){
		System.out.println(problem58());
	}


	public static int problem58(){
        int cornerNums = 1;
        int primeCorners = 0;

        for(int i = 3;  ; i+=2){

            int nonPrimeCorner = i*i;
            cornerNums+=4;

            int cornerNum = nonPrimeCorner - i+1;
            for(int k = 1; k < 4; k++){

                if(Factors.isPrime(cornerNum)){
                    primeCorners++;
                }
                cornerNum -= (i-1);
            }

            if( 10 > ((double)primeCorners/cornerNums*100) ){

                return i;
            }
        }
    }


}

