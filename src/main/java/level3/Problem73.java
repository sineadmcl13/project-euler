package level3;

/**
 * https://projecteuler.net/problem=73
 */

public class Problem73 {

	public static void main(String [] args){
		System.out.println(problem73());
	}


	public static int problem73(){

        int count=0;
        double lowTarget=1.00/3.00;
        double highTarget=1.00/2.00;


        for(int i = 2; i <= 12000; i++){
            double reducedFraction;

            numeratorLoop:
            for(int j=(int)(i*(lowTarget)); j<(i*highTarget)+1; j++){


                for(int a=2; a<=j; a++){
                    if(j%a == 0 && i%a == 0){

                        continue numeratorLoop;
                    }
                }

                reducedFraction=(double)j/i;

                if(reducedFraction>lowTarget && reducedFraction<highTarget){
                    count++;
                }

            }

        }

        return count;

    }


}

