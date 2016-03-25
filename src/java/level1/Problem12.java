package level1;

import functions.Factors;

/**
 * https://projecteuler.net/problem=12
 **/

public class Problem12 {

    public static void main(String [] args){

        long traingleNum=0;

        for (int i =1 ; ; i++){
            traingleNum+=i;

            if(Factors.returnFactors(traingleNum).size()>500){
                System.out.println(traingleNum);
                break;
            }
        }
    }
}