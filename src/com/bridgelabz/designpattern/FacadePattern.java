package com.bridgelabz.designpattern;

import org.json.simple.JSONObject;

import com.bridgelabz.utility.FacadeImplementation;
import com.bridgelabz.utility.Utility;

public class FacadePattern {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		//String path="/home/bridgeit/project/File/AddressBook.json";
		System.out.println("Enter File Path");
		String path=utility.next();
		FacadeImplementation implementation=new FacadeImplementation();
		JSONObject jsonObject=implementation.getDetailsFromFile(path);
		implementation.printDetails(jsonObject);
	}

}
