package level2;

import functions.Factors;
import functions.Permutations;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://projecteuler.net/problem=41
 * */

public class Problem41 {

	public static void main(String[] args){
        System.out.println(problem41());
	}


    public static Integer problem41(){

        ArrayList<Integer> permutations = returnPermutations(7654321);
        ArrayList<Integer> primes = Factors.sieveOfEratosthenes(7654321);

        for(int i = primes.size()-1; i>=0; i--){
            if(permutations.contains(primes.get(i))){
                return primes.get(i);
            }
        }

        return 0;
    }

    public static ArrayList<Integer> returnPermutations(Integer num){
        String numString = num.toString();
        char [] numbers = new char[numString.length()];

        for(int i =0; i<numString.length(); i++){
            numbers[i]=(char) Integer.parseInt(numString.substring(i, i+1));
        }
        ArrayList<Integer> permutations = new ArrayList<Integer>();

        //sort the array into lexicographic order and add as first permutation to the list
        Arrays.sort(numbers);
        Integer listString = getNumberFromArray(numbers);

        if(listString%2!=0 && listString%5!=0) {
            permutations.add(listString);
        }

        //find each permutation and add to the list
        do{
            Permutations.nextPermutation(numbers);
            listString = getNumberFromArray(numbers);
            if(listString%2!=0 && listString%5!=0) {
                permutations.add(listString);
            }
        }while(Permutations.hasNextPermutation(numbers));

        //return the list of permutations
        return permutations;
    }

    private static Integer getNumberFromArray(char[] numbers) {
        String listString="";
        for (char s : numbers)
        {
            listString += (int)s;
        }
        return Integer.parseInt(listString);
    }
}
