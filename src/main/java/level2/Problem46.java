package level2;

import functions.Factors;

import java.util.ArrayList;

/**
 * https://projecteuler.net/problem=46
 * */

public class Problem46 {

	public static void main(String[] args){
        System.out.print(problem46());
	}


    public static int problem46(){

        ArrayList<Integer> twiceSquareNums = new ArrayList<>();

        twiceSquareNums.add(2*(1*1));
        twiceSquareNums.add(2*(2*2));

        outsideLoop:
        for(int i =3; ; i+=2){

            twiceSquareNums.add(2*(i*i));
            twiceSquareNums.add(2*((i+1)*(i+1)));

            if(!Factors.isPrime(i)){

                for(int twiceSquare : twiceSquareNums){
                    if(twiceSquare>i){
                        return i;
                    }else{

                        int primeNum = i-twiceSquare;
                        if(Factors.isPrime(primeNum)){
                            break;
                        }
                    }

                }

            }
        }

    }
}
