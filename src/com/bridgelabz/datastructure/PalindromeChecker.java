package com.bridgelabz.datastructure;



import com.bridgelabz.utility.DeQueue;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Enter a String:");
		String str=utility.next();
		DeQueue<Character> dequeue=new DeQueue<Character>(str.length());
		DeQueue<Character> dequeue1=new DeQueue<Character>(str.length());
		String str1="";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			dequeue.addAtEnd(str.charAt(i));
		}
		str1=dequeue.toString();
		for(int i=0;i<str.length();i++)
		{
			dequeue1.addAtBegin(str.charAt(i));
		}
		str2=dequeue1.toString();
		if(str1.equals(str2))
		{
			System.out.println("It is a palindrome!!!!!");
		}
		else
		{
			System.out.println("It is not a palindrome!!!!!");
		}
		
	}

}
