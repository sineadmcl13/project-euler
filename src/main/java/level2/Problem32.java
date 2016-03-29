package level2;

import functions.NumberUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * https://projecteuler.net/problem=32
 * */

public class Problem32 {

	public static void main (String[] args){
        System.out.println(problem32());
	}

    public static int problem32(){
        Set<Integer> productSet = new HashSet<Integer>();

        for (int i=1; i <9999; i++){

            for(int j=1; j<999; j++){

                String numberString = i+""+j+""+i*j;
                if(numberString.length()==9){
                    if(NumberUtils.IsPandigital(numberString)){
                        productSet.add(i*j);
                    }
                }
            }
        }

        int total=0;
        for(int i:productSet){
            total+=i;
        }

        return total;
    }

}
