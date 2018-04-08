/**
 * Purpose:To Find harmonic funtion 
 * @author Vimlesh Kumar
 * @since 20-03-2018
 *
 */

package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Utility;

public class HarmonicFunction {
	
	static double harmonic=0.0;
	public static void harmonic()
	{
		
			Utility utility=new Utility();
			System.out.println("Enter for how many no you want harmonic number:");
			int number=utility.nextInt();
			if(number!=0)
			{
				for(int i=1;i<=number;i++)
				{
					harmonic+=1.0/i;
					//System.out.println("Harmonic Number H"+i+" :"+harmonic);
				}
				System.out.println(number+" Harmonic value is: "+harmonic);
			}
			else
			{
				System.out.println("Number should be greater than 0!!");
			}
		
	}

	public static void main(String[] args) {
		harmonic();

	}

}
