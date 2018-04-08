/**
 * Purpose:To calculate monthly payment  using principal,rate and duration
 * @author Vimlesh Kumar
 * @since 2 March 2018
 *
 */
package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;
public class MonthlyPayments {

	public static void main(String[] args) {
		double principal=Integer.parseInt(args[0]);
		float rate=Integer.parseInt(args[1]);
		int duration=Integer.parseInt(args[2]);
		double payment=monthlyPayment(principal,rate ,duration );
		System.out.println("Principal is: "+principal);
		System.out.println("Rate is: "+rate);
		System.out.println("Duration is :"+duration);
		System.out.println("Your Monthly Payment Would be: "+payment);
		
	}

}
