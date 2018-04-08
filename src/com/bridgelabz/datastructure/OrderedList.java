/**
 * Purpose:To create a Ordered linked list without using collection library
 * @author Vimlesh Kumar
 * @since 18-03-2018
 *
 */

package com.bridgelabz.datastructure;

import static com.bridgelabz.utility.Utility.readFromFile;
import static com.bridgelabz.utility.Utility.writeToFile;


import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;


public class OrderedList {

	public static void main(String[] args) {
		
		Utility utility=new Utility();
		LinkedList<Integer> list=new LinkedList<Integer>();
		String path="/home/bridgeit/project/File/OrderedList.txt";
		String fileData[] = readFromFile(path);
		
		for(int i=0;i<fileData.length-1;i++)
		{
			list.addAtEnd(Integer.parseInt(fileData[i]));
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
		
		writeToFile(path,string);
		fileData=readFromFile(path);
		list.order();
		list.printList();
	}

}
