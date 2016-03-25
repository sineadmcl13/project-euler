package level1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Problem19 {

	public static void main(String [] args){

		int count=0;

		Calendar date = new GregorianCalendar(1901, Calendar.JANUARY, 1);

		do{

			if(date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
				count++;
			}

			date.add(Calendar.MONTH, 1);

		}while(date.get(Calendar.YEAR)<=2000);

		System.out.println(count);

	}//main

}//class
