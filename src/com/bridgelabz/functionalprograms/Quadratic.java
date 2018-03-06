package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void quadratic()
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter coefficient of x^2 ,x and constant:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			double delta=Math.sqrt(Math.pow(b,2)-(4*a*c));
			System.out.println("delta"+delta);
			double root1=((-b)+(delta/(2*a)));
			double root2=((-b)-(delta/(2*a)));
			System.out.println("Root 1:"+root1 +"\nRoot 2:"+root2);
		}
		
	}
	public static void main(String[] args) {
		quadratic();
	}

}
