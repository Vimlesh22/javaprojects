package com.bridgelabz.algorithms;
import static com.bridgelabz.algorithms.Utility.toBinary;
public class ToBinary {

	public static void main(String[] args) {
		Utility util=new Utility();
		System.out.println("Enter a Number:");
		int no=util.nextInt();
		
		toBinary(no);
		
		
	}

}
