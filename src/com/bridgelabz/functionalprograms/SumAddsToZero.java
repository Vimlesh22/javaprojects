/**
 * Purpose:To find the triplet if in array any three number adds upto zero
 * @author Vimlesh Kumar
 * @since 18-03-2018
 *
 */


package com.bridgelabz.functionalprograms;


import com.bridgelabz.utility.Utility;

public class SumAddsToZero {
	static int count=0;
	public static void sum()
	{
			Utility utility=new Utility();
			System.out.println("Enter how many elements you want:");
			int number=utility.nextInt();
			int array[]=new int[number];
			System.out.println("Enter elements:");
			for(int i=0;i<number;i++)
			{
				array[i]=utility.nextInt();
			}
			sumzero(array);
		
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
