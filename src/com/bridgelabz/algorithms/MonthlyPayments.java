package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.*;
import com.bridgelabz.utility.Utility;
public class MonthlyPayments {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Principal ,Rate and Duration: ");
		double principal=utility.nextDouble();
		float rate=utility.nextFloat();
		int duration=utility.nextInt();
		double payment=monthlyPayment(principal, rate, duration);
		System.out.println("Your Monthly Payment Would be: "+payment);
		
	}

}
