package level2;

import functions.Factors;
import functions.Permutations;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * https://projecteuler.net/problem=49
 * */

public class Problem49 {

	public static void main(String[] args){
		System.out.println(problem49());
	}


    public static String problem49(){

        ArrayList<Integer> primes = Factors.sieveOfEratosthenes(9999);

        for (Iterator<Integer> iterator = primes.iterator(); iterator.hasNext();) {
            Integer prime = iterator.next();

            if (prime <1000) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
            }
        }

        for(int i : primes){

            if(primes.contains(i+3330)){

                if(Permutations.isPermutation(i, i+3330)){

                    if(primes.contains(i+6660)){

                        if(Permutations.isPermutation(i, i+6660)){

                            if(!(i == 1487)){
                                return ""+i+(i+3330)+(i+6660);
                            }

                        }

                    }
                }
            }
        }

        return "";

    }
}
