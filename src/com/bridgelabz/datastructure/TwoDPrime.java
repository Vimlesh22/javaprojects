package com.bridgelabz.datastructure;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class TwoDPrime {

	public static void main(String[] args) {
		Utility utility= new Utility();
		String twodarray[][]=new String[10][50];
		System.out.println("Enter Range");
		int range=utility.nextInt();
		String str=utility.primeNumber(range);
		String[] prime=str.split(" ");
	
		String[] strrange={"0-100","100-200","200-300","300-400","400-500","500-600","600-700","700-800","800-900","900-1000"};
		for(int row=0;row<1000;row++)
		{
			if(row==0)
			{
				for(int col=0;col<10;col++)
				{
					System.out.print(twodarray[row][col]=strrange[col]+" ");
				}
				System.out.println("");
			}
		}
		for(int row=1;row<1000;row++)
		{
			
			
				
				
				int col=0;
				switch(row)
					{
						case 1:
							for(int k=0;k<100;k++)
							{
								if(Integer.parseInt(prime[k])>0 && Integer.parseInt(prime[k])<100)
								{
								 System.out.println(twodarray[row][col]= prime[k]);
								}
							}
							row++;
							col++;
							break;
						
						case 2:
							for(int k=0;k<100;k++)
							{
								if(Integer.parseInt(prime[k])>100 && Integer.parseInt(prime[k])<200)
								{
								 System.out.println(twodarray[row][col]= prime[k]);
								
								}
							}
							row++;
							col++;
							break;
							
					
				
			}
		}

	}

}
