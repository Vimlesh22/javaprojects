/**
 * Purpose:Finding the given string is an anagram or not.
 * @author Vimlesh Kumar
 * @since 28 Feb 2018
 *
 */

package com.bridgelabz.algorithms;

import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;

public class Anagram {
	

	public static void main(String[] args) 
	{
		Utility util=new Utility();
		System.out.println("Enter a string");
		String string1= util.nextLine();
		string1=string1.replaceAll(" ","");
		System.out.println("Enter a string to check anagram");
		String string2=util.nextLine();
		string2=string2.replaceAll(" ","");

		boolean result=anagram(string1,string2);
		if(result==true)
		{
			System.out.println("Given String is an anagram!!!");
		}
		else

		{
			System.out.println("Given String is not an anagram!!!");
		}
				
	}
	
	
	
	
	
}


