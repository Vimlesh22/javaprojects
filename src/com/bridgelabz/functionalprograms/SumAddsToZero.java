package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumAddsToZero {
	static int count=0;
	public static void sum()
	{
		try(Scanner sc=new Scanner(System.in);)
		{
			System.out.println("Enter how many elements you want:");
			int num=sc.nextInt();
			int arr[]=new int[num];
			System.out.println("Enter elements:");
			for(int i=0;i<num;i++)
			{
				arr[i]=sc.nextInt();
			}
			sumzero(arr);
			
		}
	}
	public static void sumzero(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						count++;
						System.out.println("i="+array[i]+"  j="+array[j]+"  k="+array[k]);
					}
				}
			}
		}
		System.out.println("Number of triplet: "+count);
	}

	public static void main(String[] args) {
		sum();
		
		
	}

}
