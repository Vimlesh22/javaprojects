package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.calculateMinNoNote;


public class VendingMachine{

	
	
	public static void main(String args[]){
		Utility util=new Utility();
		System.out.println("Enter the Amnount:");
		float amount=util.nextFloat();
		if(amount<1)
		{
			System.out.println("Amount should be greater than zero!!!!");
		}
		
		else
		{	
		calculateMinNoNote(amount);
		System.out.println("Minimum number notes required is:"+util.mNote);
		}
	}

	
}