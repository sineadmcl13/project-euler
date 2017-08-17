package level3;

import static functions.Permutations.isPermutation;

import java.util.stream.IntStream;

/**
 * https://projecteuler.net/problem=52
 * */

public class Problem52 {

	public static void main(String[] args){
	    System.out.print(problem52());
	}


    public static int problem52(){

        return IntStream.iterate(1, i -> i + 1)
                        .filter(Problem52::isAMatch)
                        .findFirst()
                        .getAsInt();

    }

    private static boolean isAMatch(int i){
        return isPermutation(i, i * 2)
            && isPermutation(i, i * 3)
            && isPermutation(i, i * 4)
            && isPermutation(i, i * 5)
            && isPermutation(i, i * 6);
    }

}

