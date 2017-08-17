package level3;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=73
 */

public class Problem74 {

	public static void main(String [] args){
		System.out.println(problem74());
	}


	public static int problem74(){

        int[] factorials = new int[10];

        int count=0;
        factorials[0]=1;

        for(int i=1; i<10; i++){
            factorials[i]=factorial(i);
        }


        for(int i =1; i<1000000; i++){
            ArrayList<Integer> chain = new ArrayList<>();
            boolean continueChain = true;
            int sumFactorialDigits=i;
            chain.add(i);
            do{
                sumFactorialDigits = returnFactorialSum(factorials, sumFactorialDigits);

                if(chain.contains(sumFactorialDigits)){
                    continueChain=false;
                }
                chain.add(sumFactorialDigits);

            }while(continueChain);


            if(chain.size()-1==60){
                count++;
            }

        }


        return count;

    }


    private static int returnFactorialSum(int[] factorials, int num){
        int sumFactorialDigits = 0;
        for(int j : returnNumberDigits(num)){
            sumFactorialDigits+=factorials[j];
        }
        return sumFactorialDigits;
    }

    private static int[] returnNumberDigits(int num){
        String numberString = String.valueOf(num);
        int[] digits = new int[numberString.length()];

        for(int i =0; i<digits.length; i++){
            digits[i]=Integer.valueOf(numberString.substring(i,i+1));
        }
        return digits;
    }


    private static int factorial(int i){
        int sum= 1;
        for(int j =1; j<=i; j++){
            sum = sum*j;
        }
        return sum;
    }

}

