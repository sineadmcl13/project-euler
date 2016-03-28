package functions;

import java.math.BigInteger;
import java.util.ArrayList;

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


    public static BigInteger returnFactorialOfNum(int num){
        BigInteger sum = BigInteger.ONE;

        for(Integer i = 1; i<=num; i++){
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        return sum;
    }

    public static BigInteger sqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }

}
