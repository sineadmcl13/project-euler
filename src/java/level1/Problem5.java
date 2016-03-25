package level1;

/**
 *  * https://projecteuler.net/problem=5
 **/

public class Problem5 {

    public static void main(String [] args){

        //start from 20*19
        outer:
        for(int i =380; ; i++){

            for(int j=2; j<=20; j++){

                if(i%j !=0){
                    continue outer;
                }
            }
            System.out.println(i);
            break;
        }

    }
}
