package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.*;
import java.util.Scanner;

public class MonthlyPayments {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal ,Rate and Duration: ");
		double principal=sc.nextDouble();
		float rate=sc.nextFloat();
		int duration=sc.nextInt();
		double payment=monthlyPayment(principal, rate, duration);
		System.out.println("Your Monthly Payment Would be: "+payment);
		
		sc.close();
	}

}
