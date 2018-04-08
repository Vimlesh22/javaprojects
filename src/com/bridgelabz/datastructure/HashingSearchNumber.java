/**
 * Purpose:To find
 * @author Vimlesh Kumar
 * @since 14-03-2018
 *
 */
package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.readFromFile;
import static com.bridgelabz.utility.Utility.writeToFile;


public class HashingSearchNumber {

	public static void main(String[] args) {
		
		String path="/home/bridgeit/project/File/hashing.txt";
		String[] number=readFromFile(path);	
		String retrieve=Utility.hashing(number);	
		String[] stringSplit=retrieve.split(" ");
		int integerArray[]=new int[stringSplit.length];
		for(int i=0;i<stringSplit.length;i++)
		{
			integerArray[i]=Integer.parseInt(stringSplit[i]);
		}
		int[] retrieveIntArray=Utility.bubbleSortInteger(integerArray);
		String string="";
		for(int i=0;i<retrieveIntArray.length;i++)
		{
			string+=retrieveIntArray[i]+" ";
		}
		System.out.println(string);
		
		//write updated list to file
		writeToFile(path,string); 
		//read updated list from file
		String[] read=readFromFile("/home/bridgeit/project/File/hashing.txt");
		for(int i=0;i<read.length;i++)
		{
			System.out.print(read[i]+" ");
			
		}
		
		

	}

}
