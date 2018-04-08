/**
 * Purpose:To find distinct coupon number in the specified range taking range as input from user.
 * @author Vimlesh Kumar
 * @since 8 March 2018
 *
 */

package com.bridgelabz.functionalprograms;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
	public static void couponNumber()
	{
		Utility utility=new Utility();
		
			System.out.println("Enter a Number");
			int number=utility.nextInt();
			ArrayList<Integer> coupon=new ArrayList<>();
			int counter=0;
			while(coupon.size()!=number){
			
			int randomNumber=ThreadLocalRandom.current().nextInt(0, number);
			if(coupon.contains(randomNumber)){
				counter++;
			}
			else{
				counter++;
				coupon.add(number);
			}
			
			System.out.println("No of iteration to find distinct coupons:"+counter);
			System.out.println(coupon.toString());}
	}

	public static void main(String[] args) {
		couponNumber();
}
}
