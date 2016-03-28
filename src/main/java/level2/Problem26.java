package level2;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=26
 * */

public class Problem26 {

	
	public static void main(String[] args){
		 
		System.out.println(problem26());
	}

	public static int problem26(){

		int maxNumber=0;
		int maxDecimalPoints=0;

		for(int i=2; i<1000; i++){
			ArrayList<Integer> decimalPoints = new ArrayList<Integer>();
			int decimalPoint=0;
            int divider = getDivider(i);
            int remainder=divider%i;

            decimalPoints.add(divider/i);

			while(remainder!=0){
				decimalPoint = (remainder*divider)/i;
				remainder=(remainder*divider)%i;
				if(decimalPoints.contains(decimalPoint)){
					break;
				}
				decimalPoints.add(decimalPoint);
			}

			if((decimalPoints.size()-decimalPoints.indexOf(decimalPoint))>maxDecimalPoints){
				maxDecimalPoints=decimalPoints.size()-decimalPoints.indexOf(decimalPoint);
				maxNumber=i;
			}

		}

		return maxNumber ;

	}

    private static int getDivider(int i) {
        int divider = 10;
        if(i>10 && i<=100){
            divider = 100;
        }else if (i>100){
            divider = 1000;
        }
        return divider;
    }

}
