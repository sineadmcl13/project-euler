package level2;

import functions.NumberUtils;
import functions.Permutations;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=43
 * */

public class Problem43 {

	public static void main(String[] args){
		System.out.print(problem43());
	}


	public static BigInteger problem43(){

		BigInteger total = BigInteger.ZERO;

		for(long i : Permutations.returnPermutations(1023456789L)){
			ArrayList<Integer> digits = NumberUtils.returnDigits(""+i);

			if(digits.size()==9){
				digits.add(0,0);
			}

			if(Integer.parseInt(""+digits.get(1)+digits.get(2)+digits.get(3)) % 2 ==0){

				if(Integer.parseInt(""+digits.get(2)+digits.get(3)+digits.get(4)) % 3 ==0){

					if(Integer.parseInt(""+digits.get(3)+digits.get(4)+digits.get(5)) % 5 ==0){

						if(Integer.parseInt(""+digits.get(4)+digits.get(5)+digits.get(6)) % 7 ==0){

							if(Integer.parseInt(""+digits.get(5)+digits.get(6)+digits.get(7)) % 11 ==0){

								if(Integer.parseInt(""+digits.get(6)+digits.get(7)+digits.get(8)) % 13 ==0){

									if(Integer.parseInt(""+digits.get(7)+digits.get(8)+digits.get(9)) % 17 ==0){

										total = total.add(new BigInteger(String.valueOf(i)));
									}
								}
							}
						}
					}
				}
			}

		}

		return total;

	}
}
