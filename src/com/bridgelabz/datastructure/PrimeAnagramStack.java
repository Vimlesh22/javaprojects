/**
 * Purpose:To find prime anagram using stack
 * @author Vimlesh Kumar
 * @since 20-03-2018
 *
 */
package com.bridgelabz.datastructure;
import static com.bridgelabz.utility.Utility.primeAnagram;

import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;


public class PrimeAnagramStack {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the range:");
		int range=utility.nextInt();
		String[] primeAnagram=primeAnagram(range);
		int[] primeAnagramInteger=new int[primeAnagram.length];
		Stack<Integer> stack=new Stack<>(primeAnagram.length);
		for(int i=0;i<primeAnagramInteger.length;i++)
		{
			primeAnagramInteger[i]=Integer.parseInt(primeAnagram[i]);
		}
		for(int i=0;i<primeAnagramInteger.length;i++)
		{
			stack.push(primeAnagramInteger[i]);
		}
		stack.displayReverse(primeAnagramInteger.length);
		
	}
	
	
}
