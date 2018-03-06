package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class HarmonicFunction {
	
	static double harmonic=0.0;
	public static void harmonic()
	{
		
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter for how many no you want harmonic number:");
			int num=sc.nextInt();
			if(num!=0)
			{
				for(int i=1;i<=num;i++)
				{
					harmonic+=1.0/i;
					//System.out.println("Harmonic Number H"+i+" :"+harmonic);
				}
				System.out.println(num+" Harmonic value is: "+harmonic);
			}
			else
			{
				System.out.println("Number should be greater than 0!!");
			}
		}
		
	}

	public static void main(String[] args) {
		harmonic();

	}

}
