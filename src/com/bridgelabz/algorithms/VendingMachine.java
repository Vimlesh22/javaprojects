/**
 * Purpose: To calculate the minimum number of Notes 
 * as well as the Notes to be returned by the Vending Machine as a Change
 * @author Vimlesh Kumar
 * @since 5 March 2018
 *
 */


package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.calculateMinNoNote;
import com.bridgelabz.utility.Utility;


public class VendingMachine{

	
	
	public static void main(String args[]){
		Utility utility=new Utility();
		System.out.println("Enter the Amnount:");
		float amount=utility.nextFloat();
		if(amount<1)
		{
			System.out.println("Amount should be greater than zero!!!!");
		}
		
		else
		{	
		calculateMinNoNote(amount);
		System.out.println("Minimum number notes required is:"+Utility.mNote);
		}
	}

	
}
