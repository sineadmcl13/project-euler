package level1;

import functions.Permutations;

/**
 * https://projecteuler.net/problem=4
 */
public class Problem4 {

    public static void main(String [] args){
        System.out.print(problem4());
    }


    public static int problem4(){
        int max=0;

        outer:
        for(int i =999; i>=100; i--){
            for(int j = 999; j>=i; j--){
                if(Permutations.isPalindrome(i*j)){
                    max = max>(i*j) ? max : (i*j);
                }
            }
        }

        return max;
    }

}
