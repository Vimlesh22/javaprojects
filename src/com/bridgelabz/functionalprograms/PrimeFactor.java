/**
 * Purpose:To find prime factor of a number given by user
 * @author Vimlesh Kumar
 * @since 10-03-2018
 *
 */

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class PrimeFactor {
	public static void primeFactor()
	{
			Utility utility=new Utility();
			System.out.println("Enter Number to find the prime factors:");
			int number=utility.nextInt();
			while (number%2==0)
	        {
	            System.out.print(2 + " ");
	            number /= 2;
	        }
	        for (int i = 3; i <= Math.sqrt(number); i+= 2)
	        {
	            while (number%i == 0)
	            {
	                System.out.print(i + " ");
	                number /= i;
	            }
	        }
	        if (number > 2)
	        {
	            System.out.print(number);
	        }
		
	}

	public static void main(String[] args) {
		primeFactor();

	}

}
