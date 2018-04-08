/**
 * Purpose:To print two dimensional array of prime number is the range specified by user
 * @author Vimlesh Kumar
 * @since 18-03-2018
 *
 */

package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.twoDPrimeNumber;
import static com.bridgelabz.utility.Utility.removeNull;


public class TwoDPrime
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int column;
		String array[][];
		System.out.println("Enter Your range:");
		int range=utility.nextInt();
		if(range%100==0)
		{
			column=range/100;
			array=new String[100][column];
		}
		else
		{
			column=(range/100)+1;
			array=new String[100][column];
		}
		array=twoDPrimeNumber(range,column);
		array=removeNull(array, column);
		for(int i=0;i<30;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+"  ");
				if(array[i][j]=="")
				{
					System.out.print("       ");
				}
			}
			System.out.println();
		}
		
	}
}