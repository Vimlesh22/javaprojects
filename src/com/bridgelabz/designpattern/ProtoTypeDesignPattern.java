package com.bridgelabz.designpattern;

import com.bridgelabz.utility.Employee;
import com.bridgelabz.utility.Utility;

public class ProtoTypeDesignPattern {
	
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Employee details: ");
		System.out.println("Enter Your Name: ");
		String name=utility.next();
		System.out.println("Enter Age: ");
		int age=utility.nextInt();
		System.out.println("Enter your MobileNo: ");
		long mobileNo=utility.nextLong();
		Employee employee=new Employee(name, age, mobileNo);
		Employee employee2=(Employee) employee.clone();
		System.out.println(employee2);
		
		
	}

}
