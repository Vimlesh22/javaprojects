package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
			
		Utility util=new Utility();
		System.out.println("Enter year,month and day");
		int year=util.nextInt();
		int month=util.nextInt();
		int day=util.nextInt();
		int day1=dayOfWeek(year,month,day);
		String arr[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("Day on "+day+"/"+month+"/"+year+" is "+arr[day1]);
	}

}
