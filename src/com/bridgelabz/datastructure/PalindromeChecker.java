package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.primeChecker;
public class PalindromeChecker {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Enter a String:");
		String str=utility.next();
		boolean result=primeChecker(str);
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
