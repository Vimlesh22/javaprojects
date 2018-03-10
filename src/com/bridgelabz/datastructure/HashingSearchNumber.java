package com.bridgelabz.datastructure;
import com.bridgelabz.utility.Utility;
import static com.bridgelabz.utility.Utility.readFromFile;
import static com.bridgelabz.utility.Utility.writeToFile;

public class HashingSearchNumber {

	public static void main(String[] args) {
		
		String path="/home/bridgeit/project/File/hashing.txt";
		String[] number=readFromFile(path);	
		String retrieve1=Utility.hashing(number);	
		String[] splitstring=retrieve1.split(" ");
		int integerarray[]=new int[splitstring.length];
		for(int i=0;i<splitstring.length;i++)
		{
			integerarray[i]=Integer.parseInt(splitstring[i]);
		}
		int[] retrieveintarray=Utility.bubbleSortInteger(integerarray);
		String string="";
		for(int i=0;i<retrieveintarray.length;i++)
		{
			string+=retrieveintarray[i]+" ";
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
