

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Stack;


public class BalancedParenthesis {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		
		System.out.println("Enter Expression:");
		String str=utility.nextLine();
		Stack<Character> stack=new Stack<Character>(str.length());
		char[] chararray=str.toCharArray();
		for(int i=0;i<chararray.length;i++)
		{
			if(chararray[i]=='(')
			{
				stack.push('(');
			}
			else if(chararray[i]==')')
			{
				stack.pop();
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("Expression is Balanced!!");
		}
		else
			System.out.println("Expression is Not Balanced!!");
		

	}

}
