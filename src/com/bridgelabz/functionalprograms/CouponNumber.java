package com.bridgelabz.functionalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
	public static void couponnumber()
	{
		Utility utility=new Utility();
		
			System.out.println("Enter a Number");
			int num=utility.nextInt();
			int randomNumber;
			ArrayList<Integer> coupon=new ArrayList<>();
			int counter=0;
			while(coupon.size()!=num)
			{
			
				randomNumber=ThreadLocalRandom.current().nextInt(0, num);
				if(coupon.contains(randomNumber))
				{
					counter++;
				}
				else
				{
					counter++;
					coupon.add(randomNumber);
				}	
			}
			System.out.println("No of iteration to find distinct coupons:"+counter);
			System.out.println(coupon.toString());
	}

	public static void main(String[] args) {
		couponnumber();
}
}
