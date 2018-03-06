package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class FlipCoin {
	
	static float head=0;
	static float tail=0;
	public  static void flip()
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter how many times coin should be flipped");
			int flip=sc.nextInt();
			if(flip>0)
			{
				for(int i=1;i<=flip;i++)
				{
					if(Math.random()<0.5)
					{
						head++;
					}
					else
					{
						tail++;
					}
					
				}
				float headpercent=(head/(head+tail))*100;
				float tailpercent=(tail/(head+tail))*100;
				System.out.println("head:"+Math.round(headpercent)+"%"+"\ntail:"+Math.round(tailpercent)+"%");
			}
			else
			{
				System.out.println("Enter Positive No. It can't be Negative");
			}
		}

	}
	 
	public static void main(String[] args) 
	{
		flip();
	}

}
