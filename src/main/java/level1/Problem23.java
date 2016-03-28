package level1;

import functions.Factors;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=23
 **/

public class Problem23 {

    private static int maxNum = 28123;

	public static void main(String [] args){
        System.out.println(problem23());
    }


    public static int problem23(){

        boolean [] listOfAbundants = findAbundantNums();
        boolean [] sumOfAbundants = new boolean[maxNum];


        //for each number under 28123 check if it can be written as the sum as two abundant sums
        for(int i=1; i<maxNum; i++){

            if(listOfAbundants[i]){

                for(int j=i; j+i<maxNum; j++){

                    if(listOfAbundants[j]){
                        sumOfAbundants[i+j]=true;
                    }

                }

            }
        }

        int sum = 0;
        for(int i= 0; i<sumOfAbundants.length; i++){
            if(!sumOfAbundants[i]){
                sum +=i;
            }
        }

        return sum;
    }


    public static boolean[] findAbundantNums(){
        boolean [] listOfAbundants = new boolean[maxNum];

        for (int i=11; i<maxNum; i++){
            ArrayList<Integer> factors = Factors.returnFactors(i);
            int sumOfFactors=0;
            for(long j : factors){
                sumOfFactors+=j;
            }
            if(sumOfFactors>i){
                listOfAbundants[i]=true;
            }
        }

        return listOfAbundants;

    }
}
