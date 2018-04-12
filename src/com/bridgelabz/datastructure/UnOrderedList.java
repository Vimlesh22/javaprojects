/**
 * Purpose:To create a UnOrdered linked list without using collection library
 * @author Vimlesh Kumar
 * @since 21-03-2018
 *
 */

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
		//String path="/home/bridgeit/project/File/UnorderedList.txt";
		System.out.println("Enter File Path");
		String path=utility.next();
			String readString[] = readFromFile(path);
			
			for(int i=0;i<readString.length;i++)
			{
				list.addAtEnd(readString[i]);
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
			writeToFile(path,string);
			readString=readFromFile(path);
			for(int i=0;i<readString.length;i++)
			{
				System.out.print(readString[i]+" ");
			}
			
			
		 
		
			
	}

}
