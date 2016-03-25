package level1;

/**
 * https://projecteuler.net/problem=2
 * */
public class Problem2 {

    public static void main (String [] args){
        System.out.println(problem2());
    }

    public static int problem2(){
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = 2;

        do{
            a=b;
            b=c;
            c=a+b;

            if(c%2==0){
                sum+=c;
            }

        }while(c<4000000);

        return sum;
    }
}
