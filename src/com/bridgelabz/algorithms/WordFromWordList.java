package com.bridgelabz.algorithms;



import static com.bridgelabz.algorithms.Utility.binarySearchString;
import static com.bridgelabz.algorithms.Utility.readFromFile;

import java.io.FileNotFoundException;


public class WordFromWordList {

	public static void main(String[] args) throws FileNotFoundException {
		Utility util=new Utility();
		System.out.println("Enter File Location");
		String filelocation=util.nextLine();
		
				System.out.println("Enter a word to find in WordList");
				String str1=util.next();
				String[] stringsplit=readFromFile(filelocation);
				int index=binarySearchString(stringsplit, str1);
				if(index>0)
				{
					System.out.println("Word Found!!!!");
				}
				else{
					System.out.println("Word Not found!!!");
				}
						
			 
			

	}

}
