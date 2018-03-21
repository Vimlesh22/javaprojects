/**
 * Purpose:To Find prime numbers between specified range. 
 * @author Vimlesh Kumar
 * @since 3 March 2018
 *
 */

package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.primeNumber;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number upto where you want prime:");
		Utility utility=new Utility();
		int range=utility.nextInt();
		System.out.println("Prime Numbers from 1 to  :"+range+"\n");
		String prime=primeNumber(range);
		System.out.println(prime);
 
	}

}
