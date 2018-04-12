/**
 * Purpose:Displaying prime and anagram number is a two D array
 * @author Vimlesh Kumar
 * @since 21-03-2018
 *
 */

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;


public class PrimeAnagram2DArray 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int column;
		String twoDArray[][];
		System.out.println("Enter range:");
		int range=utility.nextInt();
		if(range%100==0)
		{
			column=range/100;
			twoDArray=new String[100][column];
		}
		else
		{
			column=(range/100)+1;
			twoDArray=new String[100][column];
		}
		twoDArray=Utility.twoDPrimeAnagram(range,column);
		twoDArray=Utility.removeNull(twoDArray, column);
		for(int i=0;i<30;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(twoDArray[i][j]+"  ");
				if(twoDArray[i][j].equals(""))
				{
					System.out.print("       ");
				}
			}
			System.out.println();
		}
	}
}