/**
 * Purpose:To create a calendar using queue
 * @author Vimlesh Kumar
 * @since 14-03-2018
 *
 */

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;


public class CalendarQueue {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Enter Month:");
		int month=utility.nextInt();
		System.out.println("Enter Year:");
		String year=utility.next();
		@SuppressWarnings("unchecked")
		Queue<String>[] queueCalendar=new Queue[7];
		for(int i=0;i<7;i++)
		{
			queueCalendar[i]=new Queue<>(7);
		}
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
				
				queueCalendar[i].enqueue(calendar[i][j]);
				
			}
		}

		for(int i=0;i<7;i++)
		{
				queueCalendar[i].display();
		}
		

	}

}
