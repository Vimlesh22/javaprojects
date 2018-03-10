package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class Power {
	public static void power()
	{
			Utility utility=new Utility();
			System.out.println("Enter Number:");
			int num=utility.nextInt();
			
	        if(num>=0 && num<31)
	        {
	        	System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
	            System.out.println();
	            System.out.println("Printing all till Power Value "+num);
		        for(int i=1;i<=num;i++)
		        {
		        	
		         	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
		        }
	        }
	        else
	        {
	        	System.out.println("N should not be greater than 31");
	        }
	
	}

	public static void main(String[] args) {
		power();

	}

}
