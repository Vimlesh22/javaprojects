package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class LeapYear {
	
	public static void leapyear()
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter Year of which leap year is to be found out:");
			String year=sc.next();
			if(year.length()>3 && year.length()<=4)
			{
				int yr=Integer.parseInt(year);
				if(yr%4==0)
				{
					if(yr%100==0)
					{
						if(yr%400==0)
						{
							System.out.println("The Year "+year+" is a Leap Year!!!");
						}
						else
						{
							System.out.println("The Year "+year+" is a Not Leap Year!!!");
						}
					}
					else
					{
						System.out.println("The Year "+year+" is a Leap Year!!!");
					}
					
				}
				else
				{
					System.out.println("The Year "+year+" is a Not Leap Year!!!");
				}
				
			}
			else
			{
				System.out.println("year should be of 4 digits!!");
			}
		}
	}

	public static void main(String[] args) {
		leapyear();
	}

}
