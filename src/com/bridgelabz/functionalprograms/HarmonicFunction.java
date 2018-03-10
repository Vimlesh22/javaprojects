package com.bridgelabz.functionalprograms;



import com.bridgelabz.utility.Utility;

public class HarmonicFunction {
	
	static double harmonic=0.0;
	public static void harmonic()
	{
		
			Utility utility=new Utility();
			System.out.println("Enter for how many no you want harmonic number:");
			int num=utility.nextInt();
			if(num!=0)
			{
				for(int i=1;i<=num;i++)
				{
					harmonic+=1.0/i;
					//System.out.println("Harmonic Number H"+i+" :"+harmonic);
				}
				System.out.println(num+" Harmonic value is: "+harmonic);
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
