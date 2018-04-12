package com.bridgelabz.objectoriented;


import static com.bridgelabz.utility.Utility.ricewheatpulse;

import com.bridgelabz.utility.Utility;


public class RiceWheatPulse {
	

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter File Path:");
		String file=utility.next();
		//String file="/home/bridgeit/project/File/InventoryDetails.json";
		ricewheatpulse(file);
	}

}
