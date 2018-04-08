/**
 * Purpose:To find power of Two
 * @author Vimlesh Kumar
 * @since 23-03-2018
 *
 */

package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class Power {
	public static void power()
	{
			Utility utility=new Utility();
			System.out.println("Enter Number:");
			int number=utility.nextInt();
			
	        if(number>=0 && number<31)
	        {
	        	System.out.println("Power of 2^"+number+" is: "+(Math.pow(2, number)));
	            System.out.println();
	            System.out.println("Printing all till Power Value "+number);
		        for(int i=1;i<=number;i++)
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
