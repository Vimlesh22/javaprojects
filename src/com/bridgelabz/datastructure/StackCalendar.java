
/**
 * Purpose:To create pwn calendar using queue
 * @author Vimlesh Kumar
 * @since 21-03-2018
 *
 */
package com.bridgelabz.datastructure;


import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;

public class StackCalendar {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		System.out.println("Enter Month:");
		int month=utility.nextInt();
		System.out.println("Enter Year:");
		String year=utility.next();
		//String[] daychar={"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		@SuppressWarnings("unchecked")
		Stack<String>[] stack=new Stack[7];
		for(int i=0;i<7;i++)
		{
			stack[i]=new Stack<String>(7);
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
				
				stack[i].push(calendar[i][j]);
				
			}
		}
		for(int i=0;i<7;i++)
		{
			stack[i].display();
		}
		
		

	}

}