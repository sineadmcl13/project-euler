package level2;

import functions.Factors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * https://projecteuler.net/problem=47
 * */

public class Problem47 {

	public static void main (String[] args){
		System.out.print(problem47());
	}

	public static int problem47(){
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int numOfPrimesRequired =4;

        for (int i=644; true; i++){

            Set<Integer> factorList = returnPrimeFactors(i);

            if(factorList.size()>=numOfPrimesRequired){

                answerList.add(i);

                for(int j = 0; j<answerList.size()-1 ; j++)
                {
                    //check to see if numbers in list are consecutive
                    if(!(answerList.get(j)+1 == answerList.get(j+1)))
                    {
                        answerList.clear();
                        answerList.add(i);
                        break;
                    }
                }

                if(answerList.size() == numOfPrimesRequired){
                    return answerList.get(0);
                }

            }else{
                answerList.clear();
            }

        }

    }


    public static Set<Integer> returnPrimeFactors(int num)    {
        Set<Integer> factorsArray = new HashSet<Integer>();

        for(int i = num-1; i>= Math.sqrt(num)-1; i--){
            if(num%i==0){

                if(Factors.isPrime(i)){
                    factorsArray.add(i);
                }
                if(Factors.isPrime(num/i)){
                    factorsArray.add(num/i);
                }

            }
        }

        return factorsArray;
    }

}
