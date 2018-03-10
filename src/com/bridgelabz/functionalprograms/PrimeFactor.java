package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {
	public static void primefactor()
	{
			Utility utility=new Utility();
			System.out.println("Enter Number to find the prime factors:");
			int num=utility.nextInt();
			while (num%2==0)
	        {
	            System.out.print(2 + " ");
	            num /= 2;
	        }
	        for (int i = 3; i <= Math.sqrt(num); i+= 2)
	        {
	            while (num%i == 0)
	            {
	                System.out.print(i + " ");
	                num /= i;
	            }
	        }
	        if (num > 2)
	        {
	            System.out.print(num);
	        }
		
	}

	public static void main(String[] args) {
		primefactor();

	}

}
