
/**
 * Purpose:To check if the string is palindrome or not
 * @author Vimlesh Kumar
 * @since 18-03-2018
 *
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.primeChecker;

public class PalindromeChecker {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Enter a String:");
		String string=utility.next();
		boolean result=primeChecker(string);
		if(result==true)
		{
			System.out.println("It is a palindrome!!!!!");
		}
		else
		{
			System.out.println("It is not a palindrome!!!!!");
		}
		
	}

}
