package com.bridgelabz.designpattern;

import com.bridgelabz.utility.Computer;
import com.bridgelabz.utility.ComputerFactory;
import com.bridgelabz.utility.Utility;

public class FactoryPattern {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.println("Enter Type of Computer");
		String type=utility.next();
		ComputerFactory computerFactory=new ComputerFactory();
		System.out.println("Enter Ram size: ");
		String ram=utility.next();
		System.out.println("Enter HDD size: ");
		String hdd=utility.next();
		System.out.println("Enter CPU frequency(in GHz): ");
		String cpu=utility.next();
		Computer computer=computerFactory.getComputer(type, ram, hdd, cpu);
		System.out.println(computer.toString());
	}
	
}
