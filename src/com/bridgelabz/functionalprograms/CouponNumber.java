package com.bridgelabz.functionalprograms;

import java.util.concurrent.ThreadLocalRandom;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
	public static void couponnumber()
	{
		Utility utility=new Utility();
		
			System.out.println("Enter a Number");
			int num=utility.nextInt();
			int arr[]=new int[num];
			
			for(int i=0;i<arr.length;i++)
			{
				
				int randomNum = ThreadLocalRandom.current().nextInt(1, num + 1);
				arr[i]=randomNum;
			
				
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
	}

	public static void main(String[] args) {
		couponnumber();
	}

}
