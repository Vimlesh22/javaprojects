package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
	public static void couponnumber()
	{
		Utility utility=new Utility();
		
			System.out.println("Enter a Number");
			int num=utility.nextInt();
			int arr[]=new int[num];
			for(int i=0;i<num;i++)
			{
				arr[i]=i+1;
			}
			for(int j=0;j<num;j++)
			{
				
				System.out.print(arr[j]+" ");
			}
		
	}

	public static void main(String[] args) {
		couponnumber();
	}

}
