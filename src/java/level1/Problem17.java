package level1;

/**
 *  * https://projecteuler.net/problem=17
 **/

public class Problem17 {

	final static String [] numberString = {"","one","two","three","four","five","six","seven","eight","nine"};
	final static String [] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	final static String [] tenNumberString = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	final static String hundred = "hundred";
	final static String and = "and";
	final static String thousand = "thousand";

	public static void main (String [] args){

		int count =0;
		for(int i = 1; i<=1000; i++){
			count+=getWord(i).length();
		}
		System.out.println(count);
	}

	public static String getWord(int i){
		String count = "";

		if(i<10){
			return numberString[i];
		}else if (i>=10 && i <20){
			return teens[i%10];
		}else if (i%10==0 & i <100){
			return tenNumberString[i/10];
		}else if (i >=20 && i <=99){
			return tenNumberString[i/10]+numberString[i%10];
		}else if (i%100==0 & i<1000){
			return numberString[i/100] + hundred;
		}else if (i>100 & i <110){
			return numberString[i/100] + hundred + and + numberString[i%10];
		}else if (i>=110 & i <120){
			return (numberString[i/100] + hundred + and + teens[i%10]);
		}else if (i>=120 & i%10==0 & i<1000){
			i=i/10;
			return (numberString[i/10] + hundred + and + tenNumberString[i%10]);
		}else if (i>=120 & i<1000){
			int temp = i%10;
			count+=numberString[i%10];
			i=i/10;
			if(i%10==0){
				return count+(numberString[i/10] + hundred + and + numberString[i%10]);
			}else if(i%10<2){
				return (numberString[i/10] + hundred + and + teens[temp]);
			}else{
				return count+(numberString[i/10] + hundred + and + tenNumberString[i%10]);
			}
		}else if (i==1000){
			return thousand +"one";
		}
		return count;
	}

}

