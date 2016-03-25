package level1;

/**
 *  https://projecteuler.net/problem=9
 **/

public class Problem9 {

    public static void main(String [] args){

        outer:
        for(int a = 1; ; a++){
            inner:
            for(int b =1; ; b++){
                double c = Math.sqrt((a*a)+(b*b));
                if(c==(int)c){
                    if(a+b+c==1000){
                        System.out.println(a+"+"+b+"="+c);

                        long ans = a*b*(int)c;
                        System.out.println(ans);

                        break outer;
                    }
                }

                if(a+b+c>1000)
                    break inner;

            }
        }
    }
}
