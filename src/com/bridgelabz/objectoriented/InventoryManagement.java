package com.bridgelabz.objectoriented;

import static com.bridgelabz.utility.Utility.inventorymanagement;

import com.bridgelabz.utility.Utility;

public class InventoryManagement {

	public static void main(String[] args) {
		Utility utility=new Utility();
		//String file="/home/bridgeit/project/File/UpdatedInvertoryDetails.json";
		System.out.println("Enter File Path");
		String file=utility.next();
		inventorymanagement(file);
	}

}
