/**
 * Purpose:To find the day of week
 * @author Vimlesh Kumar
 * @since 1 March 2018
 */
package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;


public class DayOfWeek {

	public static void main(String[] args) {
			
		Utility utility=new Utility();
		System.out.println("Enter year,month and day");
		int year=utility.nextInt();
		int month=utility.nextInt();
		int day=utility.nextInt();
		int dayOfWeek=dayOfWeek(year,month,day);
		String weekDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("Day on "+day+"/"+month+"/"+year+" is "+weekDay[dayOfWeek]);
	}

}
