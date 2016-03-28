package level2;

/**
 * https://projecteuler.net/problem=29
 * */

import java.util.HashSet;
import java.util.Set;


public class Problem29 {

	public static void main(String[] args){
        System.out.println(problem29());
	}

    public static int problem29(){

        Set<Double> distinctPowers = new HashSet<Double>();

        for(int a=2; a<=100; a++){

            for(int b=2; b<=100; b++){
                distinctPowers.add(Math.pow(a, b));
            }

        }

        return distinctPowers.size();

    }
}
