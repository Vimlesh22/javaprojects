package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.squareRoot;

public class SquareRoot {

	public static void main(String[] args) {
		Utility util=new Utility();
		System.out.println("Enter number to find squareroot");
		double num=util.nextDouble();
		double root=squareRoot(num);
		System.out.println("Square Root of Number is: "+root);
		

	}

}
