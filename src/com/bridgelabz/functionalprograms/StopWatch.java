package com.bridgelabz.functionalprograms;


import java.util.Scanner;

public class StopWatch {
	static double timeelapse=0,second,second2;
	public static void stopwatch()
	{
		
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Do you want to start the stopwatch?yes or no?");
			String ask=sc.next();
			if(ask.equals("yes") || ask.equals("y"))
			{
				System.out.println("Stop watch started....");
				second = System.currentTimeMillis();
				System.out.println("Do you want to stop the stopwatch?yes or no?");
				String ask1=sc.next();
				if(ask1.equals("yes") || ask1.equals("y"))
				{
					System.out.println("Stop watch stopped....");
					second2 = System.currentTimeMillis();
					timeelapse=second2-second;
					
				}
				
				
			}
			
			else
			{
				System.out.println("else");
				System.exit(0);
			}
			System.out.println("Time elapsed :"+timeelapse+"millisecond");
			
		}
	}

	public static void main(String[] args) {
		stopwatch();
		
	}

}