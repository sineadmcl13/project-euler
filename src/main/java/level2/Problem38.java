package level2;

 /**
 * https://projecteuler.net/problem=39
 * */

import functions.NumberUtils;

public class Problem38 {

    public static void main (String[] args){
        System.out.println(problem38());
    }


    public static int problem38(){
        int answer=0;

        firstLoop:
        for(int i=2; i<9999; i++){
            String digits = "";

            for(int j = 1; j<10; j++){

                digits = digits.concat(""+i*j);
                if(digits.length()>9){
                    continue firstLoop;
                }

                if(digits.length()==9 && NumberUtils.IsPandigital(digits)){
                    if (Integer.parseInt(digits)>answer){
                        answer= Integer.parseInt(digits);
                    }
                }

            }
        }
        return answer;

    }
}
