package com.bridgelabz.algorithms;





import com.bridgelabz.utility.Utility;


import static com.bridgelabz.utility.Utility.primeAnagramPalindrome;

public class PrimeAnagramPalindrome {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Range :");
		int range=utility.nextInt();
		primeAnagramPalindrome(range);
	}

}
