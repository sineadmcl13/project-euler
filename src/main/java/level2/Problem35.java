package level2;


import functions.Factors;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=35
 * */

public class Problem35 {

	public static void main (String[] args){
	    System.out.println(problem35());
    }

	public static int problem35(){
        int answer=1;
        nextNumber:
        for (Integer i = 1; i<=1000000; i+=2){

            //if a digit in the number is divisible by 2 then at least permutation
            // will not be prime so you can break out of that number
            if (hasEvenDigit(i)){
                continue;
            }

            //check if number is prime
            if(Factors.isPrime((i))){

                int [] digits = convertStringToArray(i);
                ArrayList<Integer> numbers= new ArrayList<Integer>();
                for (int j: digits){
                    numbers.add(j);
                }

                //rotate the array of numbers to check if its prime
                for(int k=0; k<digits.length; k++){
                    int temp = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(temp);

                    StringBuilder nextRotation= new StringBuilder("");
                    numbers.forEach(nextRotation::append);

                    //add this check before you check for primes otherwise primes
                    //with double digits will get counted twice e.g 11
                    if(i== Integer.parseInt(nextRotation.toString())){
                        answer++;
                        continue nextNumber;
                    }

                    //check if next rotation is prime. if its not then check next number in sequence by breaking out
                    if(!Factors.isPrime(Integer.parseInt(nextRotation.toString()))){
                        continue nextNumber;
                    }

                    if(i== Integer.parseInt(nextRotation.toString())){
                        answer++;
                        continue;
                    }
                }

            }
        }

       return answer;

    }

    public static boolean hasEvenDigit(Integer num){
        String numString = num.toString();
        int [] digits = new int[numString.length()];

        for(int i =0; i<numString.length(); i++){
            digits[i]= Integer.parseInt(numString.substring(i, i+1));
        }

        for(int t : digits){
            if(t%2==0){
                return true;
            }
        }
        return false;
    }

    public static int [] convertStringToArray(Integer num){
        //create an array of the digits in number to rotate them
        String numString = num.toString();
        int [] numbers = new int[numString.length()];

        for(int j =0; j<numString.length(); j++){
            numbers[j]= Integer.parseInt(numString.substring(j, j+1));
        }

        return numbers;
    }
}
