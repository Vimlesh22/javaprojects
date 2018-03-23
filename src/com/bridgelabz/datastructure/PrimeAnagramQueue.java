package com.bridgelabz.datastructure;

import static com.bridgelabz.utility.Utility.primeAnagram;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramQueue {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter the range:");
		int range=utility.nextInt();
		String[] primeAnagram=primeAnagram(range);
		int[] primeAnagramInteger=new int[primeAnagram.length];
		Queue<Integer> queue=new Queue<>(primeAnagram.length);
		for(int i=0;i<primeAnagramInteger.length;i++)
		{
			primeAnagramInteger[i]=Integer.parseInt(primeAnagram[i]);
		}
		for(int i=0;i<primeAnagramInteger.length;i++)
		{
			queue.enqueue(primeAnagramInteger[i]);
		}
		queue.display();
		

	}

}
