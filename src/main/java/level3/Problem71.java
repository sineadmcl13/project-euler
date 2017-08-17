package level3;


/**
 * https://projecteuler.net/problem=71
 */

public class Problem71 {

	public static void main(String [] args){
		System.out.println(problem71());
	}


	public static int problem71(){

        double targetFraction = 3.0/7.0;
        double closetToTarget = 0.40;
        int closestToTargetNumerator=0;

        denominatorLoop:
        for(int i =3; i<1000000; i++){
            double reducedFraction;

            numeratorLoop:
            for(int j=(int)(i*(closetToTarget)); j<(i*targetFraction)+1; j++){

                for(int a=2; a<Math.sqrt(j)+1; a++){
                    if(j%a==0){
                        if(i%a==0){
                            continue numeratorLoop;
                        }
                    }
                }

                reducedFraction=(double)j/i;

                if(reducedFraction>targetFraction){
                    continue denominatorLoop;
                }

                if(reducedFraction<targetFraction && reducedFraction>closetToTarget){
                    closetToTarget=reducedFraction;
                    closestToTargetNumerator=j;
                }

                if(j/i>targetFraction){
                    break;
                }
            }

        }

        return closestToTargetNumerator;

    }


}

