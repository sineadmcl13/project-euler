package level1;

import java.util.stream.IntStream;

/**
 *  https://projecteuler.net/problem=1
 **/

public class Problem1 {

    private static int count = 0;

    public static void main(String [] args){
        System.out.print(problem1());
    }

    public static int problem1(){

        IntStream.range(1, 1000).forEach(i -> {
            if(i%3==0 || i%5==0){
                count+=i;
            }
        });

        return count;
    }


}
