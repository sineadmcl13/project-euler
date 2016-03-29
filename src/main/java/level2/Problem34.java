package level2;

import functions.NumberUtils;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=34
 * */

public class Problem34 {

    public static void main (String[] args){
        System.out.println(problem34());
    }

    public static int problem34(){

        //create arrayList of digit sum of factorials for nums 1 to 9
        int [] factorials = new int[10];

        factorials[0]=1;
        factorials[1]=1;

        for(int i=2; i<=9; i++){
            factorials[i]=factorials[i-1]*i;
        }

        int answer=0;
        for(int i =3; i<9999999; i++){

            ArrayList<Integer> digits = NumberUtils.returnDigits(i);
            int total=0;
            for(int j: digits){
                total+=factorials[j];
            }

            if(i==total){
                answer+=i;
            }
        }

        return answer;

    }
}
