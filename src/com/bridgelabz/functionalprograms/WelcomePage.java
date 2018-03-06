package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class WelcomePage {
	
	public static void welcome()
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter Your Name :");
			String name=sc.nextLine();
			if(name.length()>3 && name.length()<20)
			System.out.println("Hello "+name+", How are you??");
			else
			System.out.println("Name length should be minimum of 3 and max of 20 character.\nTry Again..!!!!!");
		}
	}
	
	public static void main(String[] args)
	{
		welcome();
	}

}
