/**
 * Purpose:To find leap year or not
 * @author Vimlesh Kumar
 * @since 18-03-2018
 *
 */

package com.bridgelabz.functionalprograms;
import static com.bridgelabz.utility.Utility.leapyear;
import com.bridgelabz.utility.Utility;

public class LeapYear {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Year:");
		String year=utility.next();
		if(year.length()!=4)
		{
			System.out.println("year should be of 4 digit");
		}
		else
		{
		boolean leap=leapyear(year);
		if(leap)
			System.out.println( "Leap Year");
		else
			System.out.println( "Not Leap Year");
		}
	}

}
