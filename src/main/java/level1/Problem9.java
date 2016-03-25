package level1;

/**
 *  https://projecteuler.net/problem=9
 **/

public class Problem9 {

    public static void main(String [] args){
        System.out.println(problem9());
    }


    public static long problem9(){
        outer:
        for(int a = 1; ; a++){
            inner:
            for(int b =1; ; b++){
                double c = Math.sqrt((a*a)+(b*b));
                if(c==(int)c){
                    if(a+b+c==1000){
                        long ans = a*b*(int)c;
                        return ans;

                    }
                }

                if(a+b+c>1000){
                    break inner;
                }

            }
        }
    }
}
