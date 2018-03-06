package com.bridgelabz.algorithms;

import static com.bridgelabz.utility.Utility.*;

import com.bridgelabz.utility.Utility;




public class SwapNibble {
	
	public static void main(String[] args) {
	
			
		Utility util=new Utility();
		System.out.println("Enter Number:");
		int num=util.nextInt();
		String str=toBinary(num);
		swapNibble(str);
		
		
				
	}

}
