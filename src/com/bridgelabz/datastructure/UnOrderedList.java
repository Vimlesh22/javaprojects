package com.bridgelabz.datastructure;
import static com.bridgelabz.utility.Utility.readFromFile;
import static com.bridgelabz.utility.Utility.writeToFile;
import com.bridgelabz.utility.LinkedList;



import com.bridgelabz.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args) 
		{
		Utility utility=new Utility();
		LinkedList<String> list=new LinkedList<String>();
		
			String str[] = readFromFile("/home/bridgeit/project/File/UnorderedList.txt");
			
			for(int i=0;i<str.length;i++)
			{
				list.addAtEnd(str[i]);
			}
			list.printList();
			System.out.println("");
			System.out.println("Enter word :");
			String word=utility.next();
			boolean check=list.search(word);
			if(check==true)
			{
				list.remove(word);
			}
			else
			{
				list.addAtBegin(word);
			}
			String string=list.toString();
			writeToFile(string);
			str=readFromFile("/home/bridgeit/project/File/UnorderedList.txt");
			for(int i=0;i<str.length;i++)
			{
				System.out.print(str[i]+" ");
			}
			
			
		 
		
			
	}

}
