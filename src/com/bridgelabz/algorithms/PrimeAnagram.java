package com.bridgelabz.algorithms;



import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import com.bridgelabz.utility.Utility;

import static com.bridgelabz.utility.Utility.primeNumber;
import static com.bridgelabz.utility.Utility.anagram;
import static com.bridgelabz.utility.Utility.palindromePrime;;

public class PrimeAnagram {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter Range :");
		int range=utility.nextInt();
		String prime=primeNumber(range);
		String[] primeArray=prime.split(" ");
		
		Object[] primePalindromeObject=palindromePrime(primeArray);
		
		String[] primePalindrome = new String[primePalindromeObject.length];
		for(int i=0;i<primePalindrome.length;i++)
		{
			primePalindrome[i]=(String)primePalindromeObject[i];
			
		}
		boolean result;
		TreeSet<String> primeAnagram=new TreeSet<String>();
		for(int i=0;i<primeArray.length;i++)
		{
			for(int j=i+1;j<primeArray.length;j++)
			{
				result=anagram(primeArray[i], primeArray[j]);
				if(result==true)
				{
					primeAnagram.add(primeArray[j]);
					primeAnagram.add(primeArray[i]);
				}
			}
		}
		
		System.out.println(primePalindrome);
		System.out.println(primeAnagram);
			
	
		
		
		

	}

}
