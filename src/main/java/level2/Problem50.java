package level2;


import functions.Factors;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=50
 * */

public class Problem50 {

	public static void main(String[] args){
        System.out.println(problem50());
	}


    public static int problem50(){

        ArrayList<Integer> primes = Factors.sieveOfEratosthenes(1000000);
        int [] numOfConsecutivePrimes = new int [1000000];

        for(int i=0; i<primes.size(); i++){

            int sum =primes.get(i);
            int count =1;

            for(int j =i+1; j<primes.size(); j++){
                count++;
                sum+=primes.get(j);

                if(sum<1000000){
                    if(numOfConsecutivePrimes[sum]<count){
                        numOfConsecutivePrimes[sum]=count;
                    }
                }
                else{
                    break;
                }
            }
        }

        int answer = 0;
        int maxConsecNum =0;

        for(int i : primes){
            if(numOfConsecutivePrimes[i]>maxConsecNum){
                maxConsecNum=numOfConsecutivePrimes[i];
                answer=i;
            }
        }

        return answer;

    }

}
