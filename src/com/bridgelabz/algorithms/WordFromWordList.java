/**
 * Purpose: To read a text file from directory and find a word in that file .
 * @author Vimlesh Kumar
 * @since 7 March 2018
 *
 */

package com.bridgelabz.algorithms;
import static com.bridgelabz.utility.Utility.readFromFile;
import static com.bridgelabz.utility.Utility.binarySearchString;
import com.bridgelabz.utility.Utility;

import java.io.FileNotFoundException;


public class WordFromWordList {

	public static void main(String[] args) throws FileNotFoundException {
		Utility utility=new Utility();
		System.out.println("Enter File Location");
		String filelocation=utility.nextLine();
		
				System.out.println("Enter a word to find in WordList");
				String word=utility.next();
				String[] stringsplit=readFromFile(filelocation);
				int index=binarySearchString(stringsplit, word);
				if(index>0)
				{
					System.out.println("Word Found!!!!");
				}
				else{
					System.out.println("Word Not found!!!");
				}
						
			 
			

	}

}
