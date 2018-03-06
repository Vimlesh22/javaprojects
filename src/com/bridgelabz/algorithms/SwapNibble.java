package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.toBinary;
import static com.bridgelabz.algorithms.Utility.swapNibble;


public class SwapNibble {
	
	public static void main(String[] args) {
	
			
		Utility util=new Utility();
		System.out.println("Enter Number:");
		int num=util.nextInt();
		String str=toBinary(num);
		swapNibble(str);
		
		
				
	}

}
