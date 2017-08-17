package level3;

/**
 * https://projecteuler.net/problem=75
 */

public class Problem75 {

	public static void main(String [] args){
		System.out.println(problem75());
	}


	public static int problem75(){

        long target=1500000;

        int stringLengths [] = new int[(int)target+1];

        for(int a =2; a<Math.sqrt(target/2); a++){

            for(int b = 1; b<a; b++){

                if (((a + b) % 2) == 1 && gcd(a, b) == 1) {
                    int aSide = (a*a)-(b*b);
                    int bSide = 2*a*b;
                    int cSide = (a*a)+(b*b);

                    int length = aSide+bSide+cSide;
                    while (length<=target){
                        stringLengths[length]++;
                        length+=aSide+bSide+cSide;
                    }
                }
            }
        }

        int count=0;
        for(int i : stringLengths){
            if (i==1){
                count++;
            }
        }

        return count;

    }


    private static int gcd(int a, int b){

        do{
            if(a==0){
                return b;
            }else if (b==0){
                return a;
            }
            int r = a%b;
            a=b;
            b=r;
        }while(true);

    }
}

