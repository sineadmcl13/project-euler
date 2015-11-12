package level1;

/**
 *  * https://projecteuler.net/problem=19
 **/
	
public class Problem19 {

	final static int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
								//  Jan, Feb,Mar,Apr,May,Jun,Jul,Aug,Sept,Oct,Nov,Dec
	final static String[] weekday = {"Mon","Tues","Wed","Thurs","Fri","Sat","Sun"};
	
	public static void main (String [] args){
		long startTime = System.currentTimeMillis();
		
		int weekdayContinue=0;
		int count =0;
		
		for(int y = 1900; y<=2000; y++){
		//update no of days on Feb for leap leaps
			if((y>1900 && y%4==0) || (y==2000)){
				monthDays[1]=29;
			}else{
				monthDays[1]=28;
			}
			for(int i : monthDays){
				for (int m=1; m<=i; m++){
					do{	
						if((m==1 & weekday[weekdayContinue].equals("Sun")) && y!=1900){
							count++;
						}
						m++;
						weekdayContinue++;
						if(m>i){
							break;
						}
					}while(weekdayContinue<=6);
					
					if(weekdayContinue>6){
						m--;
						weekdayContinue=0;
					}
				}//end of month days
			}//end of months
		}//end of year
		
		System.out.println(count);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime*0.001+" secs");
	
	
	}//main

	
}//class
