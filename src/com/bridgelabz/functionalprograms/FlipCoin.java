/**
 * Purpose:Takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 * @author Vimlesh Kumar
 * @since 10 March 2018
 *
 */

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	
	
	public  static void flip()
	{
		float head=0;
		float tail=0;
		Utility utility=new Utility();
			System.out.println("Enter how many times coin should be flipped");
			int flip=utility.nextInt();
			if(flip>0)
			{
				for(int i=1;i<=flip;i++)
				{
					if(Math.random()<0.5)
					{
						head++;
					}
					else
					{
						tail++;
					}
					
				}
				float headPercentage=(head/(head+tail))*100;
				float tailPercentage=(tail/(head+tail))*100;
				System.out.println("head:"+Math.round(headPercentage)+"%"+"\ntail:"+Math.round(tailPercentage)+"%");
			}
			else
			{
				System.out.println("Enter Positive No. It can't be Negative");
			}
		}

	
	 
	public static void main(String[] args) 
	{
		flip();
	}

}
