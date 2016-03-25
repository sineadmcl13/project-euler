package level1;

import functions.Factors;

/**
 * https://projecteuler.net/problem=3
 */
public class Problem3 {

    public static void main(String [] args){
        System.out.println(problem3());
    }

    public static long problem3(){
        long num = 600851475143L;
        long maxPrime = 0;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                if(Factors.isPrime(num/i)){
                    maxPrime = (maxPrime>(num/i) ? maxPrime : num/i);
                }
                if(Factors.isPrime(i)){
                    maxPrime = (maxPrime>i ? maxPrime : i);
                }
            }
        }

        return maxPrime;
    }


}
