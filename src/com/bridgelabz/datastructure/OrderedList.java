package com.bridgelabz.datastructure;

import static com.bridgelabz.utility.Utility.readFromFile;
import static com.bridgelabz.utility.Utility.writeToFile;


import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

public class OrderedList {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		LinkedList<Integer> list=new LinkedList<Integer>();
		String str[] = readFromFile("/home/bridgeit/project/File/OrderedList.txt");
		
		for(int i=0;i<str.length-1;i++)
		{
			list.addAtEnd(Integer.parseInt(str[i]));
		}	
		list.order();
		list.printList();
		System.out.println("");
		System.out.println("Enter word :");
		int number=utility.nextInt();
		boolean check=list.search(number);
	
		if(check==true)
		{
			list.remove(number);
		}
		else
		{
			list.addAtBegin(number);
		}
		String string=list.toString();
		
		writeToFile(string);
		str=readFromFile("/home/bridgeit/project/File/UnorderedList.txt");
		list.order();
		list.printList();
	}

}
