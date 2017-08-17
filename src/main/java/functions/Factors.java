package functions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Factors {


    /**
     *
     * @param num
     * @return true is number passed in is a prime, otherwise false
     */
    public static boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        if (num < 9) return true;
        if (num % 3 == 0) return false;

        long counter = 5;
        while ((counter * counter) <= num) {
            if (num % counter == 0) return false;
            if (num % (counter + 2) == 0) return false;
            counter += 6;
        }

        return true;
    }


    /**
     *
     * @param upperLimit
     * @return list of primes up to the specified upperlimit
     */
    public static ArrayList<Integer> sieveOfEratosthenes(int upperLimit){
        boolean [] primes = new boolean[upperLimit+1];
        primes[0]=true;
        primes[1]=true;
        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= upperLimit; i++) {

            if (!primes[i]) {
                for (int j = i; i*j <= upperLimit; j++) {
                    primes[i*j] = true;
                }
            }
        }

        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i =0; i<upperLimit; i++){
            if(!primes[i]){
                primeList.add(i);
            }
        }
        return primeList;
    }

    /**
     *
     * @param num that you want the factors of
     * @return ArrayList<Integer> of the factors of the passed integer. Factors will include the digit 1
     */
    public static ArrayList<Long> returnFactors(long num){
        ArrayList<Long> factors = new ArrayList<Long>();

        //every number can divided by 1
        factors.add(1L);

        //iterate through each number and check if it is a factor
        for(long i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                factors.add(i);
                if(!(num/i==i)){
                    factors.add(num/i);
                }
            }
        }
        factors.add(num);

        return factors;
    }
    /**
     *
     * @param num that you want the factors of
     * @return ArrayList<Integer> of the factors of the passed integer. Factors will include the digit 1
     */
    public static ArrayList<Integer> returnFactors(int num){
        ArrayList<Integer> factors = new ArrayList<Integer>();

        //every number can divided by 1
        factors.add(1);

        //iterate through each number and check if it is a factor
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                factors.add(i);
                if(!(num/i==i)){
                    factors.add(num/i);
                }
            }
        }

        return factors;
    }


    /**
     *
     * @param number
     * @param primeList
     * @return a set of the prime factors of the number that has been provided
     */
    public static Set<Double> returnPrimeFactors(int number, List<Integer> primeList){

        Set<Double> primeFactors = new HashSet<>();

        int temp = number;

        do {
            //find next prime factor
            int nextFactor = findNextPrimeFactor(temp, primeList);
            primeFactors.add((double)nextFactor);
            temp = temp/nextFactor;

        }
        while (!Factors.isPrime(temp));

        primeFactors.add((double)temp);

        return primeFactors;
    }


    private static int findNextPrimeFactor(int temp, List<Integer> primeList){
        for(int i =2; i<temp; i++){
            if(temp%primeList.get(i)==0){
                return primeList.get(i);
            }
        }
        return temp;
    }


    public static BigInteger returnFactorialOfNum(int num){
        BigInteger sum = BigInteger.ONE;

        for(Integer i = 1; i<=num; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        return sum;
    }



    /**
     *
     * @param numerator of fraction
     * @param denominator of fraction
     * @return an array of two integers which represents the numerator and denomiator of a
     * fracton which is the fraction passed in as paramters in its lowest terms
     */
    public static int[] returnFractionLowestTerms(int numerator, int denominator){
        int [] fraction = new int [2];

        int maxFactor;
        do{
            maxFactor=0;
            ArrayList<Integer> factorsNumerator = returnFactors(numerator);
            factorsNumerator.add(numerator);
            Collections.sort(factorsNumerator);

            ArrayList<Integer> factorsDenominator = returnFactors(denominator);
            factorsDenominator.add(denominator);
            Collections.sort(factorsDenominator);

            for(int i : factorsNumerator){
                if(factorsDenominator.contains(i)){
                    if(i>maxFactor){
                        maxFactor=i;
                    }
                }
            }
            numerator=numerator/maxFactor;
            denominator=denominator/maxFactor;
        }while(maxFactor>1);

        fraction[0]=numerator;
        fraction[1]=denominator;

        return fraction;
    }

}
