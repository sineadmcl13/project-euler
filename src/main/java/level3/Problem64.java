package level3;

import java.util.ArrayList;
import java.util.List;

/**
 * https://projecteuler.net/problem=64
 */

public class Problem64 {

	public static void main(String [] args){
		System.out.println(problem64());
	}


	public static int problem64(){


        int oddPeriodCounter= 0;

        for(int i = 1; i<=10000; i++){

            if(Math.sqrt(i)==(int)Math.sqrt(i)){
                continue;
            }

            List<Integer> mNums = new ArrayList<>();
            List<Integer> dNums = new ArrayList<>();
            List<Integer> aNums = new ArrayList<>();
            int periodCount=0;

            int m = 0;
            int d = 1;
            int a = (int)Math.sqrt(i);

            mNums.add(m);
            dNums.add(d);
            aNums.add(a);

            boolean loop = true;

            do{
                m = d*a-m;
                d = (i-(m*m))/d;
                a = (int)(Math.sqrt(i)+m)/d;

                for (int b =0; b<aNums.size(); b++){
                    if(mNums.get(b)==m){
                        if(dNums.get(b)==d){
                            if(aNums.get(b)==a){
                                periodCount = aNums.size()-b;
                                loop= false;
                            }
                        }
                    }
                }
                mNums.add(m);
                dNums.add(d);
                aNums.add(a);

            }while(loop);

            if(periodCount % 2 !=0){
                oddPeriodCounter++;
            }
        }

        return oddPeriodCounter;

    }


}

