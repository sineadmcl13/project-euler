package level2;

import functions.NumberUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://projecteuler.net/problem=40
 * */

public class Problem40 {

	public static void main(String[] args){
        System.out.println(problem40());
	}

    public static int problem40(){

        List<Integer> constant = returnChampernownesConstant();
        return constant.get(1) * constant.get(10) * constant.get(100) * constant.get(1000) * constant.get(10000)
                * constant.get(100000) * constant.get(1000000);
    }

    private static List<Integer> returnChampernownesConstant(){

        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        for(Integer i =1; i<200000; i++){
            List<Integer> digits =NumberUtils.returnDigits(i);
            Collections.reverse(digits);
            nums.addAll(digits);
        }
        return nums;
    }
}
