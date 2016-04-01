package level2;

/**
 * https://projecteuler.net/problem=44
 * */

public class Problem44 {

	public static void main(String[] args){
        System.out.println(problem44());
	}


    public static long problem44(){

        boolean foundD =false;
        long d=0;

        for (long i =1; ; i++){
            long iPentNum = i*(3*i-1)/2;
            long minDiff = (i+1)*(3*(i+1)-1)/2 - iPentNum;


            if(foundD && minDiff>d){
                break;
            }

            for(long j=i+1; ;j++){
                long jPentNum =  j*(3*j-1)/2;
                long kPentNum =  (j+1)*(3*(j+1)-1)/2;

                if(iPentNum+jPentNum<kPentNum || (jPentNum-iPentNum>d && foundD)){
                    break;
                }

                if(isPentagonal(iPentNum+jPentNum)){

                    if(isPentagonal(jPentNum-iPentNum)){

                        if(jPentNum-iPentNum<d || !foundD){
                            d= jPentNum-iPentNum;
                        }
                        foundD=true;
                    }

                }

            }

        }

        return d;

    }


    public static boolean isPentagonal(long pentNum){

        double num = (Math.sqrt(24*pentNum+1)+1)/6;
        if(num == (long)num){
            return true;
        }
        else return false;
    }

}
