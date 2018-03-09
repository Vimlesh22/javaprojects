package com.bridgelabz.datastructure;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

public class HashingSearchNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		@SuppressWarnings("unchecked")
		LinkedList<Integer> list[]=new LinkedList[11];
		String str="/home/bridgeit/project/File/hashing.txt";
		String[] number=utility.readFromFile(str);
		Map<Integer,LinkedList<Integer>> slot=new HashMap<>();
		//System.out.println(Arrays.toString(number));
		int arr[]=new int[number.length-1];
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(number[i]);
		}
		for(int i=0;i<11;i++)
		{
			
			list[i]=new LinkedList<>();
			
		}
		for(int j=0;j<arr.length;j++)
		{
			x=arr[j]%11;
			list[x].addAtEnd(arr[j]);
		}
		for(int i=0;i<11;i++)
		{
			slot.put(i, list[i]);
		}
		for(Map.Entry<Integer,LinkedList<Integer>> mp:slot.entrySet())
		{
			System.out.println("Key: "+mp.getKey()+"    Value: "+mp.getValue());
		}
		
		System.out.println("Enter Number to be searched");
		Integer search=utility.nextInt();
		for(Map.Entry<Integer,LinkedList<Integer>> mp:slot.entrySet())
		{
			int num=search%11;
			
		}
		
		
		

	}

}
