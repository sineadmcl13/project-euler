package level3;

import functions.Factors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://projecteuler.net/problem=60
 */

public class Problem60 {

	public static void main(String [] args){
		System.out.println(problem60());
	}




	public static int problem60(){

        Map<Integer, List<Integer>> concattedPrimes = returnPrimes();

        for (Map.Entry<Integer, List<Integer>> pairs : concattedPrimes.entrySet()) {
            List<Integer> firstNumberValues = pairs.getValue();
            Integer parentNumber = pairs.getKey();

            for (int i = 0; i < firstNumberValues.size() - 4; i++) {
                int secondNumber = firstNumberValues.get(i);

                for (int j = i + 1; j < firstNumberValues.size() - 3; j++) {
                    int thirdNumber = firstNumberValues.get(j);

                    for (int k = j + 1; k < firstNumberValues.size() - 2; k++) {
                        int fourthNumber = firstNumberValues.get(k);

                        for (int m = k + 1; m < firstNumberValues.size() - 1; m++) {
                            int fifthNumber = firstNumberValues.get(m);

                            if (checkIfSetOfFivePrimes(concattedPrimes, firstNumberValues, secondNumber, thirdNumber, fourthNumber, fifthNumber)) {
                                return parentNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
                            }
                        }
                    }

                }

            }

        }

        return 0;

    }


    private static Map<Integer, List<Integer>> returnPrimes(){
        List<Integer> primes = Factors.sieveOfEratosthenes(10000);

        Map<Integer, List<Integer>> concattedPrimes = new HashMap<>();

        for(int p=0; p<primes.size(); p++){
            List<Integer> concatable = new ArrayList<>();

            for(int x=p+1; x<primes.size(); x++){

                if(isReversiblePrime(primes.get(p),primes.get(x))){
                    concatable.add(primes.get(x));
                }
            }
            concattedPrimes.put(primes.get(p), concatable);
        }

        return concattedPrimes;
    }


    private static boolean checkIfSetOfFivePrimes(Map<Integer, List<Integer>> concattedPrimes, List<Integer> firstNumberValues, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {

        return checkIfListContainsNumbers(firstNumberValues, secondNumber, thirdNumber, fourthNumber, fifthNumber)
            && checkIfListContainsNumbers(concattedPrimes.get(secondNumber),thirdNumber, fourthNumber, fifthNumber )
            && checkIfListContainsNumbers(concattedPrimes.get(thirdNumber), fourthNumber, fifthNumber)
            && checkIfListContainsNumbers(concattedPrimes.get(fourthNumber), fifthNumber);
    }


    private static boolean checkIfListContainsNumbers(List<Integer> values, int... nums){

        for(int n : nums){
            if (! values.contains(n)){
                return false;
            }
        }
        return true;
    }




    private static int concatInts(int a, int b){
        return Integer.parseInt(String.valueOf(a)+String.valueOf(b));
    }


    private static boolean isReversiblePrime(int a, int b){
        return Factors.isPrime(concatInts(a, b)) && Factors.isPrime(concatInts(b, a));
    }


}

