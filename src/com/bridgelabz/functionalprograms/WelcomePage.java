/**
 * Purpose:To create Welcome Page for User.
 * @author Vimlesh Kumar
 * @since 15-03-2018
 *
 */

package com.bridgelabz.functionalprograms;


import com.bridgelabz.utility.Utility;

public class WelcomePage {
	
	public static void welcome()
	{
		Utility utility=new Utility();
			System.out.println("Enter Your Name :");
			String name=utility.nextLine();
			if(name.length()>3 && name.length()<20)
			System.out.println("Hello "+name+", How are you??");
			else
			System.out.println("Name length should be minimum of 3 and max of 20 character.\nTry Again..!!!!!");
		
	}
	
	public static void main(String[] args)
	{
		welcome();
	}

}
