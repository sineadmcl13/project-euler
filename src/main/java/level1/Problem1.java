package level1;

/**
 *  https://projecteuler.net/problem=1
 **/

public class Problem1 {

    public static void main(String [] args){
        System.out.print(problem1());
    }

    public static int problem1(){
        int count=0;
        for(int i =0; i< 1000; i++){
            if(i%3==0 || i%5==0){
                count+=i;
            }
        }
        return count;
    }


}
