package level2;


import functions.Factors;

import java.util.Arrays;

/**
 * https://projecteuler.net/problem=37
 * */

public class Problem37 {

	public static void main (String[] args){
		System.out.println(problem37());
	}

	public static int problem37(){

		int count=0;
		int sum=0;
		for(int i=11; ; i+=2){

			if(firstAndLastPrime(i)){
				break;
			}

			if(Factors.isPrime(i)){

				if(truncatePrime(i, true)){
					if(truncatePrime(i, false)){
						count++;
						sum +=i;
					}
				}
			}

			if(count==11){
				break;
			}

		}

		return sum;

	}

	public static int trimNumber(Integer num, boolean fromRight){
		String originalNum = num.toString();
		if(fromRight){
			String newNum = originalNum.substring(0, (originalNum.length()-1));
			return Integer.parseInt(newNum);
		}else{
			String newNum = originalNum.substring(1);
			return Integer.parseInt(newNum);
		}
	}

	public static boolean truncatePrime(int num, boolean fromRight){
		Integer temp = num;;
		while(temp.toString().length()>1){
			temp=trimNumber(temp, fromRight);
			if(!Factors.isPrime(temp)){
				return false;
			}
			if(temp.toString().length()==1){
				//at this stage the number is prime at each stage when trimmed
				return true;
			}
		}

		return true;
	}

	public static boolean firstAndLastPrime(Integer num){
		int [] primes = {2,3,5,7};

		String originalNum = num.toString();
		String firstNum = originalNum.substring(0, 1);
		String lastNum = originalNum.substring(originalNum.length()-1, originalNum.length());

		if(!Arrays.asList(primes).contains(Integer.parseInt(firstNum))){
			return false;
		}
		if(!Arrays.asList(primes).contains(Integer.parseInt(lastNum))){
			return false;
		}

		return true;

	}

}
