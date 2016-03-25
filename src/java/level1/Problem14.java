package level1;

/**
 * https://projecteuler.net/problem=14
 **/

public class Problem14 {

    public static void main(String [] args){

        int maxCount=0;
        int maxSequenceNum=0;

        for(int i =2; i<1000000; i++){
            long temp = i;
            int count = 1;

            do{
                temp = returnNextCollatzNum(temp);
                count++;
            }while(temp!=1);

            if(count>maxCount){
                maxCount=count;
                maxSequenceNum=i;
            }
        }

        System.out.print(maxSequenceNum);

    }

    
    public static long returnNextCollatzNum(long num){
        if(num%2==0){
            return num/2;
        }else{
            return (3*num)+1;
        }
    }

}