package level2;

/**
 * https://projecteuler.net/problem=28
 * */

public class Problem28 {

	
	public static void main(String[] args){
        System.out.println(problem28());
	}
	
	public static int problem28(){
        int cornerNum=1;
        int sum=1;

        for(int i=3; i<=1001; i+=2){
            for(int j=0; j<4; j++){
                cornerNum+=i-1;
                sum+=cornerNum;

            }

        }

        return sum;
    }
}
