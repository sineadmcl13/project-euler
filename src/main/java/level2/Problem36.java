package level2;

import functions.Palindrone;

/**
 * https://projecteuler.net/problem=36
 * */

public class Problem36 {

	public static void main (String[] args){
        System.out.println(problem36());
	}

    public static int problem36(){
        int answer=0;
        for(Integer i = 1; i<1000000; i++){
            String binary = Integer.toBinaryString(i);
            if(Palindrone.isPalindromic(i.toString())){
                if(Palindrone.isPalindromic(binary)){
                    answer+=i;
                }
            }
        }
        return answer;
    }
}
