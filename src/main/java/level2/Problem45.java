package level2;

/**
 * https://projecteuler.net/problem=46
 * */

public class Problem45 {

	public static void main(String[] args){
        System.out.print(problem45());
	}


    public static long problem45(){

        for(long i =144; ; i++){
            Long hexNum = i*((2*i)-1);

            if(isPentagonal(hexNum)){
                if(isTriangular(hexNum)){
                    return hexNum;
                }
            }

        }
    }


    public static boolean isTriangular(double triNum){

        double num = (Math.sqrt(8*triNum+1)-1)/2;
        if(num == (int)num){
            return true;
        }else return false;
    }


    public static boolean isPentagonal(double pentNum){

        double num = (Math.sqrt(24*pentNum+1)+1)/6;
        if(num == (int)num){
            return true;
        }else return false;
    }

}
