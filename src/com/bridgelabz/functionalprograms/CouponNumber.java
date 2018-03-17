package com.bridgelabz.functionalprograms;

import java.util.concurrent.ThreadLocalRandom;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
	public static void couponnumber()
	{
		Utility utility=new Utility();
		
			System.out.println("Enter a Number");
			int num=utility.nextInt();
			ArrayList<Integer> coupon;
			int counter=0;
			while(coupon.size()!=num){
			
			int randomNumber=ThreadLocalRandom.current().nextInt(0, num);
			//System.out.print(randomNumber+" ");
			if(coupon.contains(randomNumber)){
				counter++;
			}
			else{
				counter++;
				coupon.add(num);
			}
		
	}

	public static void main(String[] args) {
		couponnumber();
	}

}
