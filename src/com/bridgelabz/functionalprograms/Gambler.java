package com.bridgelabz.functionalprograms;


import com.bridgelabz.utility.Utility;

public class Gambler {
	static float win=0,bet=0,lose=0;
	public static void gambler()
	{
			Utility utility=new Utility();
			System.out.println("Enter Stake");
			int cash=utility.nextInt();
			System.out.println("Enter Goal");
			int goal=utility.nextInt();
			System.out.println("Enter Number of time to play");
			int num=utility.nextInt();
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
		
		
		System.out.println("Win: "+win+"\nlose:"+lose);
		System.out.println("*******************************");
		float winpercent=(win/(win+lose))*100;
		float losepercent=(lose/(win+lose))*100;
		System.out.println("Win  %  = "+winpercent);
		System.out.println("Lose %  = "+losepercent);
	}
		
	public static void main(String[] args) {
		gambler();

	}

}
