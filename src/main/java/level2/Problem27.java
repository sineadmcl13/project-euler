package level2;

import functions.Factors;

/**
 * https://projecteuler.net/problem=27
 * */

public class Problem27 {

	public static void main(String[] args){
        System.out.println(problem27());
	}

    public static int problem27(){
        int aMax=0;
        int bMax=0;
        int nMax=0;

        for(int a=-1000; a<1000; a++){

            for(int b=-1000; b<1000; b++){

                int n=0;
                while(Factors.isPrime(Math.abs(n*n+a*n+b))){
                    n++;
                }

                if(n>nMax){
                    nMax=n;
                    aMax=a;
                    bMax=b;
                }

            }

        }


        return aMax*bMax;


    }



}

