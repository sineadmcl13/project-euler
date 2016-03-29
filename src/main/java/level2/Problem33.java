package level2;

import functions.Factors;
import functions.NumberUtils;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=33
 * */

public class Problem33 {

    public static void main (String[] args){
        System.out.println(problem33());
    }

    public static int problem33(){

        int numerator=1;
        int denominator=1;

        for(double i=10; i<99; i++){
            for(double j=i+10; j<99; j++){

                double result = i/j;

                ArrayList<Integer> iDigits = NumberUtils.returnDigits((int)i);
                ArrayList<Integer> jDigits = NumberUtils.returnDigits((int)j);

                for(int k =0; k<iDigits.size(); k++){

                    for(int l =0; l<jDigits.size(); l++){

                        if(iDigits.get(k)==jDigits.get(l)){
                            iDigits.remove(k);
                            jDigits.remove(l);

                            double iDigitsRemoved = returnNum(iDigits);
                            double jDigitsRemoved = returnNum(jDigits);

                            if(i%10==0 && j%10==0){
                                break;
                            }else if(result==(iDigitsRemoved/jDigitsRemoved)){
                                numerator*=i;
                                denominator*=j;
                            }
                            break;

                        }
                    }
                }

            }
        }

        int fraction [] = Factors.returnFractionLowestTerms(numerator,denominator);
        return fraction[1];

    }

    private static int returnNum(ArrayList<Integer> digits){
        String num="";
        for(int i : digits){
            num+=i;
        }
        return Integer.parseInt(num);
    }

}
