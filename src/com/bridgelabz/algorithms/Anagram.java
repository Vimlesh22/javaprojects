package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.anagram;

public class Anagram {
	

	public static void main(String[] args) 
	{
		Utility util=new Utility();
		System.out.println("Enter a string");
		String str1= util.nextLine();
		System.out.println("Enter a string to check anagram");
		String str2=util.nextLine();


		boolean result=anagram(str1,str2);
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


