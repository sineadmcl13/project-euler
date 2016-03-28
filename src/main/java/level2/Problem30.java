package level2;

/**
 * https://projecteuler.net/problem=30
 * */

public class Problem30 {

	public static void main(String[] args){
        System.out.println(problem30());
	}
	
	public static int problem30(){

        int answer=0;

        //check each number up 300000 because (9^5)*5 <300000
        for(int i=10; i<300000; i++){
            int sum=0;
            for(int j: returnDigits(i)){
                sum+= Math.pow(j, 5);
            }

            if(sum==i){
                answer+=sum;
            }

        }

        return answer;
	}

    public static int [] returnDigits (int num){
        String number = String.valueOf(num);
        int [] digits = new int [number.length()];

        for(int i=0; i<number.length(); i++){
            digits[i]= Integer.parseInt(number.substring(i, i+1));
        }

        return digits;
    }
}
