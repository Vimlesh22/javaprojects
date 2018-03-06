package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Gambler {
	static int win=0,bet=0,lose=0;
	public static void gambler()
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter Stake");
			int cash=sc.nextInt();
			System.out.println("Enter Goal");
			int goal=sc.nextInt();
			System.out.println("Enter Number of time to play");
			int num=sc.nextInt();
			int stake=cash;
			for(int i=1;i<=num;i++)
			{
				while(stake>0 && stake <goal)
				{
					bet++;
					double x=Math.random();
					
					if(x<0.5)
					{
						stake--;
						
					}
					else 
					{
						stake ++;
					}
					
					
				}
				if(stake==goal)
				{
					win++;
				}
				else
				{
					lose++;
				}
				stake=cash;
			}
		
		}
		System.out.println("Win: "+win+"\nlose:"+lose);
	}
		
	public static void main(String[] args) {
		gambler();

	}

}
