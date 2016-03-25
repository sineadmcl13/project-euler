package level1;

import functions.Factors;

/**
 *  https://projecteuler.net/problem=7
 **/

public class Problem7 {

    public static void main(String [] args){
        System.out.println(problem7());
    }

    public static int problem7(){
        int count = 0;

        for(int i=2; ;i++){
            if(Factors.isPrime(i)){
                count++;
                if(count==10001){
                    return i;
                }//if
            }//if
        }//for

    }
}
