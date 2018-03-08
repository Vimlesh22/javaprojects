package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter month and year");
		int month=utility.nextInt();
		String year=utility.next();
		String[][] calendar=utility.calendar(month, year);
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(calendar[i][j]!=null)
				{
					do
					{
						calendar[i][j]+=" ";
					}while(calendar[i][j].length()<=7);
				}
				if(calendar[i][j]==null)
				{
					calendar[i][j]="        ";
				}
				System.out.print(calendar[i][j]+" ");
				
            }
			System.out.println("");
		}

	}

}
