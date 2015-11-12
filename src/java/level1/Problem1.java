package level1;

/**
 *  * https://projecteuler.net/problem=1
 **/

public class Problem1 {

    public static void main(String [] args){

        int count=0;
        for(int i =0; i< 1000; i++){
            if(i%3==0 || i%5==0){
                count+=i;
            }
        }
        System.out.print(count);
    }
}
