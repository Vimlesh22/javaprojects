/********************************************************** 
 *  Purpose: Utility Class for Methods.
 *
 *  @author  Vimlesh Kumar
 *  @since   26-02-2018
 *
 **********************************************************/
package com.bridgelabz.utility;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Utility {
	static int NUM=0;
	Scanner sc;
	public static int mNote=0;
	
	 /**
	  * Default Constructor to initialize Scanner Object.  
	  */
	public Utility()
	{
		sc=new Scanner(System.in);
	}
	
	/**
	  * Method to take Boolean as input.  
	  */
	public Boolean nextBoolean() {
		
		return sc.nextBoolean();
	}
	/**
	  * Method to take String as input.  
	  */
	public String next()
	{
		try
		{
			return sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	  * Method to take String as input considering spaces.  
	  */
	public String nextLine()
	{
		try
		{
			return sc.nextLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	/**
	  * Method to take Long as input considering spaces.  
	  */
	public long nextLong()
	{
		try
		{
			return sc.nextLong();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	/**
	  * Method to take Double value as input.  
	  */
	public double nextDouble()
	{
		try
		{
			return sc.nextDouble();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0.0;
	}
	/**
	  * Method to take Integer as input.  
	  */
	public int nextInt()
	{
		try
		{
			return sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	/**
	  * Method to take Float as input.  
	  */
	public float nextFloat()
	{
		try
		{
			return sc.nextFloat();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	/**
	  * purpose:Method to take Calculate SquareRoot using Newton method.
	  * @param number the number to check square root 
	  * @return returns square root of a number 
	  */
	public static double squareRoot(double number)
	{
		double t=number;
		double div;
		double epsilon=(Math.pow(10,-15));
		/**
		 * repeat until desired accuracy reached 
		 * using condition Math.abs(t - c/t) > epsilon*t 
		 * where epsilon = 1e-15
		 */
		do
		{
			t= ((number/t)+t)/2;
			div=Math.abs(t-(number/t));
		}
		while(div>epsilon*t);
		return t;
	}
	
	
	/**
	 * purpose: finding day of week
	 * @param year year in which to find a day
	 * @param month month in which to find a day
	 * @param day day on which to find a day
	 * @return returns day in in number as sunday is 0,monday is 1 and so on..
	 */
	public static int dayOfWeek(int year,int month,int day)
	{
		int y1 = (year) - ((14 - month) / 12);
		int x = (y1) + (y1/4) - (y1/100) + (y1/400);
		int m1 =(month) + ((12 * ((14 - month) / 12)) - 2);
		int d1 = (day + x + (31*m1) / 12) % 7;
		return d1;
	}
	
	
	/**
	 * purpose:Finding Monthly Payment
	 * @param principal input for  principal loan amount 
	 * @param rate input for rate of interest
	 * @param duration of loan amount
	 * @return returns monthly payment for loan
	 */
	public static double monthlyPayment(double principal,float rate,int duration)
	{
		float r=rate/(12*100);
		double n=12*duration;
		double cal=Math.pow((1+r),-n);
		double payment= (principal*r)/(1-cal);
		return payment;
	}
		
	/**
	 * purpose:Finds Fahrenheit from Celcius
	 * @param cal value of Celcius
	 * @return temperature value in fahrenheit 
	 */
	public static float celToFah(int cal)

	{
		float result=0;
		result=((cal*9)/5) + 32;
		return result;
	}
	
	
	/**
	 * purpose:Finds Celcius from Fahrenheit 
	 * @param fah value of Fahrenheit 
	 * @return temperature value in Celcius 
	 */
	public static float fahToCel(int fah)

	{
		float result=0;
		result=((fah - 32)*5)/9;
		return result;
	}
	
	
	/**purpose:There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which is returned by the Vending Machine
	 * @param amount for which vending machine needs to return Change
	 */
	public static void calculateMinNoNote(float amount){
		
		if(amount == 0)
			return;
	


		if(amount>=1000){
			mNote+=((int)amount/1000);
			System.out.println("1000 Rupes Notes is: "+((int)amount/1000));
			if(amount/1000 == 0)
				return;
			else
				calculateMinNoNote(amount%1000);
		}
		
		//calculate 500 rupees notes
		else if(amount>= 500){
			mNote+=((int)amount/500);
			System.out.println("500 Rupes Notes is: "+((int)amount/500));
			if(amount/500 == 0)
				return;
			else
				calculateMinNoNote(amount%500);
		}

		//calculate 100 rupees notes
		else if(amount>= 100){
			mNote+=((int)amount/100);
			System.out.println("100 Rupes Notes is: "+((int)amount/100));
			if(amount/100 == 0)
				return;
			else
				calculateMinNoNote(amount%100);
		}

		//calculate 50 rupees notes
		else if(amount>= 50){
			mNote+=((int)amount/50);
			System.out.println("50 Rupes Notes is: "+((int)amount/50));
			if(amount/50 == 0)
				return;
			else
				calculateMinNoNote(amount%50);
		}
		
		//calculate 10 rupees notes
		else if(amount>= 10){
			mNote+=((int)amount/10);
			System.out.println("10 Rupes Notes is: "+((int)amount/10));
			if(amount/10 == 0)
				return;
			else
				calculateMinNoNote(amount%10);
		}

		//calculate 5 rupees notes
		else if(amount>= 5){
			mNote+=((int)amount/5);
			System.out.println("5 Rupes Notes is: "+((int)amount/5));
			if(amount/5 == 0)
				return;
			else
				calculateMinNoNote(amount%5);
		}

		//calculate 2 rupees notes
		else if(amount>= 2){
			mNote+=((int)amount/2);
			System.out.println("2 Rupes Notes is: "+((int)amount/2));
			if(amount/2 == 0)
				return;
			else
				calculateMinNoNote(amount%2);
		}

		//calculate 1 rupees notes
		else if(amount>= 1){
			mNote+=((int)amount/1);
			System.out.println("1 Rupes Notes is: "+((int)amount/1));
			if(amount/1 == 0)
				return;
			else
				calculateMinNoNote(amount%1);
		}
	}
	
	
	/**
	 * purpose:takes a command-line argument N, asks you to think of a number between 0 and N-1
	 * @param low lower range for guessing number
	 * @param up upper range for guessing number
	 */
	public static void find(int low,int up)
	{
	
    	//Displaying the value
    	if(low==up){
        System.out.println("Your number is : "+low);
        System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
        return;
    	}

        //Finding middle value between range low and up
    	int mid=(low+up)/2;
    	int ch;
    	System.out.println("Press 1 : "+low+" - "+mid);
    	System.out.println("Press 2 : "+(mid+1)+" - "+up);
    	ch=new Utility().nextInt();

    	//Number is in first half
   	 	if(ch==1)
   	 	{
   	 		find(low,mid);
   	 	}

    	//Number is in second half
    	else
    	{
    		find(mid+1,up);
    	}
	}
	
	
	/**
	 * Purpose: create 2D array of anagrams that are prime number
	 * @param range range of numbers
	 * @param col number of columns
	 * @return 2D array of anagrams that are prime number
	 */
	public static String[][] twoDPrimeAnagram(int range,int col)
	{
		int temp=0,temp1,temp2,temp3=1;
		String array[][]=twoDPrimeNumber(range, col);
		String arrayAnagram[][]=new String[100][col];
		for(int i=0;i<col;i++)
		{
			arrayAnagram[0][i]=temp+"-"+(temp+100);
			temp=temp+100;
		}
		for(int j=0;j<col;j++)
		{
			for(int i=1;i<100;i++)
			{
				if(array[i][j]!=null)
				{
					for(int k=i+1;k<100-i;k++)
					{
						if(array[k][j]!=null)
						{
							temp1=Integer.parseInt(array[i][j]);
							temp2=Integer.parseInt(array[k][j]);
							if(    (anagram(array[i][j], array[k][j]))  && 
								   (primeNumber1(temp1) && primeNumber1(temp2))    )
							{
								arrayAnagram[temp3][j]=array[i][j];
								temp3++;
								arrayAnagram[temp3][j]=array[k][j];
								temp3++;
							}
						}
					}
				}
			}
			temp3=1;
		}
		return arrayAnagram;
}
	
	/**
	 * Purpose: creates 2d array of range of prime numbers
	 * @param range max range of prime numbers
	 * @return 2d array of prime numbers
	 */
	public static String[][] twoDPrimeNumber(int range,int col)
	{
		String array[][]=new String[100][col];
		int a=100,b=-1,c=0;
		int temp=0;
		for(int i=0;i<col;i++)
		{
			array[0][i]=temp+"-"+(temp+100);
			temp=temp+100;
		}
		temp=2;
	
		for(int i=0;i<col;i++)
		{
			for(int j=1;j<100;j++)
			{
				for(int k=temp;k<a;k++)
				{
					
					if(primeNumber1(k))
					{
						array[j][i]=""+k;
						temp=k+1;
						break;
					}
					if(k==range)
					{
						b=range;
						break;
					}
				}
			}
			c=c+100;
			temp=c;
			a=a+100;
			if(b==range)
			{
				break;
			}
		}
		return array;
	}
	
	public static boolean primeNumber1(int number)
	{
		if(number==0 || number ==1)
		{
			return false;
		}
		if(number == 2)
		{
			return true;
		}
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	/**
	 * Purpose: removing null values from 2d arrays
	 * @param array 2d array input
	 * @param col number of columns
	 * @return null free 2d array
	 */
	public static String[][] removeNull(String[][] array,int col)
	{
		for(int i=1;i<100;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(array[i][j]!=null)
				{
					do
					{
						array[i][j]=array[i][j]+" ";
					}
					while(array[i][j].length()<=6);
				}
				if(array[i][j]==null)
				{
					array[i][j]="";
				}
			}
		}
		return array;
	}
/**
	
	/**
	 * purpose:Given two strings are to be checked for anagram.
	 * One string is an anagram of another if the second is simply a rearrangement of the first. 
	 * For example, 'heart' and 'earth' are anagrams.
	 * @param string1 string value 
	 * @param string2 string value which is to be checked for anagram
	 * @return
	 */
	public static boolean anagram(String string1,String string2)
	{
		
			

			char bubbleAnagramArray1[]=bubbleSortStringAna(string1);
			char bubbleAnagramArray2[]=bubbleSortStringAna(string2);
			String string3=new String(bubbleAnagramArray1);
			String string4=new String(bubbleAnagramArray2);
			
			if(string3.equals(string4))
			{
				
				return true;
			}
			else
			{
				return false;
			}
	
	}

	
	
	/**
	 * purpose:Finds out prime number between range 1 to 1000.
	 * @param size size is no upto which you want prime number 
	 * @return returns string of prime number
	 */
	public static String primeNumber(int size)

	{
		String prime="";
		for (int i = 1; i <= size; i++)         
	      { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
	          {
	             if(i%num==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter ==2)
	          {
	        	  //System.out.print(i+" ");
	        	 prime+=i+" ";

	          }	
	       }
		return prime;
		
		
	}
	

	/**
	 * purpose:Finds Binary representation of number provided as input
	 * @param number number for finding binary
	 * @return integer array for binary representation of decimal number
	 */
	public static String toBinary(int number)
	{
		String string="";
		
		int array[]=new int[50];
		int i=0;
	    while (number > 0)
	    {
	    	
	        array[i] = number%2;
	        i++;
	        number = number/2;
	    }
	    System.out.println("Binary Represented of Number is:");
	    for (int j = i ; j >= 0 ; j--){
	    	string+=array[j];
	        System.out.print(array[j]);
	    }
		
	    return string;
	    
	}
	
	/**
	 * purpose:To swap nibble of given string
	 * @param string string to swap nibble
	 */
	public static void swapNibble(String string)
	{
		//Swapping Nibble and printing decimal value
		String str2="";
		String str3="";
		String str4="";
		for(int i=0;i<=3;i++)
		{
			str2=str2+string.charAt(i);
		}
		for(int i=4;i<string.length();i++)
		{
			str3=str3+string.charAt(i);
		}
		str4=str3+str2;
		
		int dec=0;
		char[] strtochar=str4.toCharArray();
		int count=0;
		for(int i=strtochar.length-1;i>=0;i--)
		{
			if(strtochar[i]=='1')
			{
				dec+=Math.pow(2,count);
			}
			count++;
		}
		System.out.println("\nDecimal Number After Swapping Nibble :"+dec);
		int num=dec;
		while(num>=0 && num%2==0)
		{
			if(num%2==0)
			{
				num=num/2;
			}
			
		}
		if(num==1)
		{
			System.out.println("The number is a power of 2");
		}
		else
		{
			System.out.println("The number is Not a power of 2");
		}
		
		
		
		
	}
	


	
	/**
	 * purpose:Bubble sort of string to find anagram using bubble sort
	 * @param str3 string value 
	 * @return character array of sorted string
	 */
	public static char[] bubbleSortStringAna(String str3)
	{
		char temp;
		char[] arr=str3.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
	
				}
			}
		}
		return arr;
	}
	

	/**
	 * purpose:this method sorts the integer array using bubble sort
	 * @param array stores value of integer in array
	 * @return sorted integer array
	 */
	public static int[]  bubbleSortInteger(int array[])

	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		return array;
	}
	

	/**
	 * purpose:this method sorts the String array using bubble sort
	 * @param str stores value of Strings in array
	 * @return sorted String of array
	 */
	public static String[] bubbleSortString(String str[])
	{
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				if(str[j].compareTo(str[j])<0)
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		return str;
	}
	
	/**
	 * purpose:this method sorts the integer array
	 * @param unSortedArray stores value of integer in array
	 * @return sorted integer array
	 */
	public static int[] insertionSortInteger(int unSortedArray[])

	{
		int n = unSortedArray.length;
        for (int i=1; i<n; ++i)
        {
            int key = unSortedArray[i];
            int j = i-1;
             
            while (j>=0 && unSortedArray[j] > key)
            {
                unSortedArray[j+1] = unSortedArray[j];
                j = j-1;
            }
            unSortedArray[j+1] = key;
        }
		return unSortedArray;
	}
	
	/**
	 * purpose:this method sorts the String array using insertion sort
	 * @param str stores value of Strings in array
	 * @return returns sorted String of array
	 */
	public static String[] insertSortSting(String str[])
	{
		int n = str.length;
        for (int i=1; i<n; ++i)
        {
            String key = str[i];
            int j = i-1;
             
            while (j>=0 && str[j].compareTo(key)>0)
            {
                str[j+1] = str[j];
                j = j-1;
            }
            str[j+1] = key;
        }
		return str;
	}
	
	

	/**
	 * purpose:Searches an element in an array using binary search method
	 * @param arr stores array of elements
	 * @param element stores element which is to be searched in an array
	 * @return index at which element is found in an array
	 */
	public static int binarySearchInteger(int arr[],int element)
	{
		int[] sortedarray=bubbleSortInteger(arr);
		int first=0;
		int last=sortedarray.length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			middle=first+(last-first)/2;
			if(arr[middle]==element)
			{
				return middle;
			}
			else if(arr[middle]<element)
			{
				first=middle+1;
			}
			else
			{
				last=middle-1;
			}
			
		}
		return -1;
	}
	
	
	
	 // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(int arrayForSort[], int first, int middle, int last)
    {
        // Find sizes of two subarrays to be merged
        int n1 = middle - first + 1;
        int n2 = last - middle;
 
        /* Create temp arrays */
        int leftArray[] = new int [n1];
        int rightArray[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            leftArray[i] = arrayForSort[first + i];
        for (int j=0; j<n2; ++j)
            rightArray[j] = arrayForSort[middle + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = first;
        while (i < n1 && j < n2)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arrayForSort[k] = leftArray[i];
                i++;
            }
            else
            {
                arrayForSort[k] = rightArray[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arrayForSort[k] = leftArray[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arrayForSort[k] = rightArray[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int array[], int first, int last)
    {
        if (first < last)
        {
            // Find the middle point
            int m = (first+last)/2;
 
            // Sort first and second halves
            sort(array, first, m);
            sort(array , m+1, last);
 
            // Merge the sorted halves
            merge(array, first, m, last);
        }
    }
 
    /* A utility function to print array of size n */
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
	
	/**
	 * purpose:Searches a string in an array using binary search method
	 * @param strr stores array of strings
	 * @param str1 stores string which is to be searched in an array
	 * @return index at which string is found in an array
	 */
	
	public static int binarySearchString(String str[],String str1)
	{
		String str2[]=insertSortSting(str);
		int first=0;
		int last=str2.length-1;
		int middle=(first+last)/2;
		while(first<=last)
		{
			middle=first+(last-first)/2;
			if(str2[middle].equals(str1))
			{
				return middle;
			}
			else if(str2[middle].compareTo(str1)<0)
			{
				first=middle+1;
			}
			else
			{
				last=middle-1;
			}
			
		}
		return -1;
	}
	
	public static void mergeSort(int arr[],int p,int r)
	{
		int q=0;
		if(p<r)
		{
			q=(p+r)/2;
			mergeSort(arr,p,q);
		}
		
	}
	
	
	/**
	 * Purpose:To find given year is a leap year or not
	 * @param year of which leap year is to be found out
	 * @returns true if leap year else returns false
	 */
	public static boolean leapyear(String year)
	{
		
				int yr=Integer.parseInt(year);
				if(yr%4==0)
				{
					if(yr%100==0)
					{
						if(yr%400==0)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else
					{
						return true;
					}
					
				}
				else
				{
					return false;
				}
				
			
		
	}
	public static void writeToFile(String path,String str)
	{
		File file=new File(path);
		try {
			PrintWriter printWriter=new PrintWriter(file);
			printWriter.write(str);
			printWriter.close();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * purpose:Reads file from the specified location
	 * @param filelocation path from which data is to be read
	 * @return returns array of string
	 */
	public static String[] readFromFile(String filelocation) 
	{
		
		
		
				int i;
				String string="";
				String[] spiltString = null;
				try 
				{
					File file=new File(filelocation);
					BufferedReader br=new BufferedReader(new FileReader(file));
					while ((i=br.read()) != -1)
					{
						string=string+(char)i;
					}
					
					spiltString=string.split(" ");
					
					br.close();
					
				}catch(IOException e)
				{
					e.printStackTrace();
				}
				return spiltString;
	}
	 

	/**
	 * Purpose:To create a calendar  of month and year given by user
	 * @param month month input given by user 
	 * @param year year input given by user
	 * @return returns twoDArray of string
	 */
	public String[][] calendar(int month,String year)
	{
		String[][] calendar=new String[7][7];
		String[] daychar={"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int leapdays[]={31,29,31,30,31,30,31,31,30,31,30,31};
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		boolean y=leapyear(year);
		
		if(y==true)
		{
			
				int day=dayOfWeek(Integer.parseInt(year),month,1);
				for(int i=0;i<7;i++)
				{
					if(i==0)
					{
						for(int k=0;k<7;k++)
						{
							calendar[i][k]=daychar[k];
						}
					}
					if(i==1)
					{
						for(int p=day;p<7;p++)
						{
							calendar[i][p]=""+(++NUM);
						}
					}
				}
				for(int i=2;i<7;i++)
				{
					for(int j=0;j<7;j++)
					{
						if(NUM==leapdays[month-1])
						{
							break;
						}
						else
						{
							calendar[i][j]=""+(++NUM);
						}
					}					
				}		
			}
		
		else
		{
			int day=dayOfWeek(Integer.parseInt(year),month,1);
			for(int i=0;i<7;i++)
			{
				if(i==0)
				{
					for(int k=0;k<7;k++)
					{
						calendar[i][k]=daychar[k];
					}
				}
				if(i==1)
				{
					for(int p=day;p<7;p++)
					{
						calendar[i][p]=""+(++NUM);
					}
				}
			}
			for(int i=2;i<7;i++)
			{
				for(int j=0;j<7;j++)
				{
					if(NUM==days[month-1])
					{
						break;
					}
					else
					{
						calendar[i][j]=""+(++NUM);
					}
				}					
			}
		}
		
		
		return calendar;
		
	}
	
	public static String hashing(String[] number)
	{
		Utility utility=new Utility();
		@SuppressWarnings("unchecked")
		LinkedList<Integer> list[]=new LinkedList[11];
		Map<Integer,LinkedList<Integer>> slot=new HashMap<>();
		
		int arr[]=new int[number.length-1];
		int x=0,mod;
		
		//converts array of string in array of integer
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(number[i]);
		}
		//creating linkedList object 
		for(int i=0;i<11;i++)
		{
			
			list[i]=new LinkedList<>();
			
		}
		//adding elements into slots
		for(int j=0;j<arr.length;j++)
		{
			x=arr[j]%11;
			list[x].addAtEnd(arr[j]);
			list[x].order();
		}
		//adding linkedlist into map
		for(int i=0;i<11;i++)
		{
			slot.put(i, list[i]);
		}
		//Iterating through map to display elements
		for(Map.Entry<Integer,LinkedList<Integer>> mp:slot.entrySet())
		{
			System.out.println("Key: "+mp.getKey()+"    Value: "+mp.getValue());
		}
		//searches the number in map
		System.out.println("Enter Number to be searched");
		Integer search=utility.nextInt();
		mod=search%11;
		//searches the number in map if found remove element else add to list
		boolean result=false;
		for(Entry<Integer, LinkedList<Integer>> sear:slot.entrySet())
		{
			
			if(mod==sear.getKey() && sear.getValue().getFirstElement()!=null)
			{
				result=list[mod].search(search);
			}
			
			
		}
		if(result == true)
		{
			System.out.println("Numer "+search+" found in list...and it has been deleted from list");
			list[mod].remove(search);
		}
		else
		{
			System.out.println("Numer "+search+" Not found in list...and it has been added to list");
			list[mod].addAtEnd(search);
			list[mod].order();
		}
		//itrate through list in which element is present and store the updated list in string
		String retrieve1="";
		
		for(Map.Entry<Integer,LinkedList<Integer>> mp:slot.entrySet())
		{
			System.out.println("Key: "+mp.getKey()+"    Value: "+mp.getValue());
			retrieve1+=mp.getValue();
		}
		return retrieve1;
	}
	
	public static void ricewheatpulse(String file)
	{
		FileReader filereader=null;
		JSONParser parser=null;
		JSONObject json=null;
		try 
		{
			filereader=new FileReader(file);
			parser=new JSONParser();
			json=(JSONObject)parser.parse(filereader);
			JSONObject rice=(JSONObject) json.get("Rice");
			JSONObject pulse=(JSONObject) json.get("Pulses");
			JSONObject wheat=(JSONObject) json.get("Wheat");
			System.out.println(rice);
			System.out.println(pulse);
			System.out.println(wheat);
			
		} 
		catch (ParseException | IOException e) 
		{
			
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if(filereader!=null)
				{
					filereader.close();
				}
			} 
			catch (IOException e) 
			{
			
				e.printStackTrace();
			}
		}
		

	}
	public static void inventorymanagement(String file)
	{
		FileReader fileReader=null;
		JSONParser parser;
		JSONObject rice,pulses,json,wheat;
		FileWriter fileWriter=null;
		long total=0; 
		try{
			fileReader=new FileReader(file);
			parser=new JSONParser();
			json=(JSONObject) parser.parse(fileReader);
			rice=(JSONObject) json.get("Rice");
			
			total=(Long)rice.get("Weight")*(Long)rice.get("Price");
			rice.put("Total",total);
			
			pulses=(JSONObject) json.get("Pulses");
			total=(Long)pulses.get("Weight")*(Long)pulses.get("Price");
			pulses.put("Total",total);
			
			wheat=(JSONObject) json.get("Wheat");
			total=(Long)pulses.get("Weight")*(Long)pulses.get("Price");
			wheat.put("Total",total);
			
			json=new JSONObject();
			json.put("Rice", rice);
			json.put("Wheat", wheat);
			json.put("Pulses", pulses);
			
			//String writefile="/home/bridgeit/project/File/UpdatedInvertoryDetails.json";
			System.out.println("Enter File Path:");
			Utility utility=new Utility();
			String writefile=utility.next();
			fileWriter=new FileWriter(writefile);
			
			fileWriter.write(json.toJSONString());
			System.out.println(json.toJSONString());
			

			
			}
		catch(IOException | ParseException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(fileReader!=null)
				{
					fileReader.close();
				}
				if(fileWriter!=null)
				{
					
						fileWriter.close();
				
				}
			} 
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
			
		}
		
	}
	public static void stockReport()
	{
		 int shares=0,price=0,total=0;
		 JSONObject json=null;
		 int totalvalue=0;
		
		 FileWriter fileWriter=null;
		 String file;
		Utility utility=new Utility();
		System.out.println("Enter No of stocks");
		int size=utility.nextInt();
		JSONArray jsonArray=new JSONArray();;
		JSONObject stockReport=null;
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Stock Name:");
			String name=utility.next();
			System.out.println("Enter Number of shares");
			shares=utility.nextInt();
			System.out.println("Enter Price of shares");
			price=utility.nextInt();
			total=shares*price;
			
			json=new JSONObject();
			json.put("Name", name);
			json.put("Shares", shares);
			json.put("Price",price);
			json.put("Total", total);
			totalvalue+=total;
			jsonArray.add(json);
			
			
			
		}
		
	
			
		
		
		stockReport=new JSONObject();
		stockReport.put("StockReport", jsonArray);
		stockReport.put("Total Share Value", totalvalue);
		//file="/home/bridgeit/project/File/Stockreport.json";
		System.out.println("Enter file Path:");
		file=utility.next();
		try 
		{
			fileWriter=new FileWriter(file);
			fileWriter.write(stockReport.toJSONString());
			System.out.println(stockReport.toJSONString());
		} 
		catch (IOException e) 
		{
						e.printStackTrace();
		}

	}
	public static void regularexpression(String input)
	{
		Utility utility=new Utility();
		String namevalidate="^[a-zA-Z ]+$";
		String contactvalidate="[0-9]{10}+$";
		String firstName="";
		String lastName="";
		String contact="";
		Pattern pattern=Pattern.compile(namevalidate);
		Matcher matcher=null;
		
		do
		{
			System.out.println("Enter First Name: ");
			firstName=utility.next();
			matcher=pattern.matcher(firstName);
			if(!matcher.matches())
			{
				System.out.println("Please Try Again!!!!!");
			}
			
		}while(!matcher.matches());
		
		
		
		Pattern pattern2=Pattern.compile(namevalidate);
		Matcher matcher2=null;
		do
		{
			System.out.println("Enter Your Last Name: ");
			lastName=utility.next();
			matcher2=pattern.matcher(lastName);
			if(!matcher2.matches())
			{
				System.out.println("Please Try Again!!!!!");
			}
		}while(!matcher2.matches());	
		Pattern pattern3=Pattern.compile(contactvalidate);
		Matcher matcher3=null;
		do
		{
			System.out.println("Enter Contact Number: ");
			contact=utility.next();
			matcher3=pattern3.matcher(contact);
			if(!matcher3.matches())
			{
				System.out.println("Please Try Again!!!!!");
			}
		}while(!matcher3.matches());
		
		
		
		SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String stringdate=formater.format(date);
		input=input.replace("<<name>>", firstName);
		input=input.replace("<<full name>>",firstName+" "+lastName);
		input=input.replace("xxxxxxxxxx", contact);
		input=input.replace("01/01/2016", stringdate);
		System.out.println(input);	
	}
	
	/**
	 * purpose: Reads json File
	 * @param file file from which json object is to be read
	 * @return returns Object of json
	 */
	public static JSONObject readJsonFile(String path)
	{
		File file=null;
		FileReader read=null;
		JSONParser parser=null;
		JSONObject jsonObject=null;
		try
		{
			file=new File(path);
			boolean empty = !file.exists() || file.length() == 0;
			if(!empty)
			{
				read=new FileReader(file);
				parser=new JSONParser();
				jsonObject=(JSONObject) parser.parse(read);
			}
			else
			{
				return null;
			}
		}
		catch(IOException | ParseException exception)
		{
			exception.printStackTrace();
			
		}
		finally
		{
			try
			{
				if(read!=null)
				{
					read.close();
				}
			}
			catch(IOException exception2)
			{
				exception2.printStackTrace();
			}
		}
		return jsonObject;
	}
	
	
	/**
	 * purpose: Reads json File 
	 * @param path gives address of file from which json array is to be read
	 * @return returns json array
	 */
	public static JSONArray readJsonArrayFile(String path)
	{
		File file=null;
		FileReader read = null;
		JSONParser parser=null;
		JSONArray jsonArray=null;
		try
		{
			file=new File(path);
			boolean empty = !file.exists() || file.length() == 0;
			if(!empty)
			{
				read=new FileReader(file);
				parser=new JSONParser();
				jsonArray=(JSONArray) parser.parse(read);
			}
			else
			{
				return null;
			}
		}
		catch(IOException | ParseException exception)
		{
			exception.printStackTrace();
			
		}
		finally
		{
			try
			{
				if(read!=null)
				{
					read.close();
				}
			}
			catch(IOException exception2)
			{
				exception2.printStackTrace();
			}
		}
		return jsonArray;
	}
	/**
	 * purpose:Writes json array to the specified file
	 * @param file file to which json object is to be written
	 * @param jsonObject json object 
	 */
	public static void writeJsonFile(String file,JSONObject jsonObject)
	{
		FileWriter write=null;
	
		try
		{
			write=new FileWriter(file);
			write.write(jsonObject.toJSONString());
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
			
		}
		finally
		{
			try
			{
				if(write!=null)
				{
					write.close();
				}
			}
			catch(IOException exception2)
			{
				exception2.printStackTrace();
			}
		}
	}
	
	/**
	 * purpose:Writes json array to the specific folder
	 * @param file file to which json object is to be written
	 * @param jsonObject json object 
	 */
	public static void writeJsonArrayFile(String file,JSONArray jsonArray)
	{
		FileWriter write=null;
	
		try
		{
			write=new FileWriter(file);
			write.write(jsonArray.toJSONString());
		}
		catch(IOException exception)
		{
			exception.printStackTrace();
			
		}
		finally
		{
			try
			{
				if(write!=null)
				{
					write.close();
			
				}
			}
				
			catch(IOException exception2)
			{
				exception2.printStackTrace();
			}
		}
	}
	
	
	public static double numberofbinarytree(double number)
	{
		double numberofbinary=(factorial(2*number))/(factorial(number+1)*factorial(number));
		return numberofbinary;
	}
	
	public static double factorial(double number)
	{
		
		double factorial=1;
		if(number>0)
		{
			for(double i=1;i<=number;i++)
			{
				factorial=factorial*i;
				
			}
			return factorial;
		}
		if(number==0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
	}
	
	/**
	 * Purpose:to check given numbers are prime or not
	 * @param string of numbers 
	 * @return true if prime else returns false
	 */
	public static boolean primeChecker(String string)
	{
		DeQueue<Character> dequeue=new DeQueue<Character>(string.length());
		DeQueue<Character> dequeue1=new DeQueue<Character>(string.length());
		String string1="";
		String string2="";
		for(int i=0;i<string.length();i++)
		{
			dequeue.addAtEnd(string.charAt(i));
		}
		string1=dequeue.toString();
		for(int i=0;i<string.length();i++)
		{
			dequeue1.addAtBegin(string.charAt(i));
		}
		string2=dequeue1.toString();
		if(string1.equals(string2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * Purpose:To check if the given array of string is prime and palindrome
	 * @param primeArray string of array containing numbers 
	 * @return object array of prime palindrome number
	 */
	public static Object[] palindromePrime(String[] primeArray)
	{
		List<String> palindromePrime1=new ArrayList<String>();
		
		for(int i=0;i<primeArray.length;i++)
		{
			boolean primecheck=primeChecker(primeArray[i]);
			if(primecheck==true)
			{
				palindromePrime1.add(primeArray[i]);
			}
		}
		
		String[] primePalindrome = new String[palindromePrime1.size()];
		for(int i=0;i<primePalindrome.length;i++)
		{
			primePalindrome[i]=(String)primePalindrome[i];
			
		}
		
		return palindromePrime1.toArray();
		
	}
	/**
	 * purpose:To find primeand anagram of numbers
	 * @param range specifies the range in which prime anagram is to be found out.
	 * @return string array of prime and anagram number
	 */
	public static String[] primeAnagram(int range)
	{
		//get string of prime number and convert string into string array
		String prime=primeNumber(range);
		String[] primeArray=prime.split(" ");
		
		//logic for prime palindrome and displaying
		Object[] primePalindromeObject=palindromePrime(primeArray);
		String[] primePalindrome = new String[primePalindromeObject.length];
		for(int i=0;i<primePalindrome.length;i++)
		{
			primePalindrome[i]=(String)primePalindromeObject[i];
			
		}
		
		//prime anagram logic and displaying list of prime anagram numbers
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
		
		//prime anagram palindrome logic and displaying it 
		String[] primeAnagramString=new String[primeAnagram.size()];
		int k=0;
		Iterator<String> iterator=primeAnagram.iterator();
		System.out.println("Prime Anagram");
		while(iterator.hasNext())
		{
			primeAnagramString[k]=iterator.next();
			k++;
		}
		
		return primeAnagramString;
		
	}
	
	/**
	 * Purpose: To find out numbers which are prime,anagram as well as palindrome in given range.
	 * @param range in which prime anagram palindrome is to be found out.
	 */
	public static void primeAnagramPalindrome(int range)
	{
				//get string of prime number and convert string into string array
				String prime=primeNumber(range);
				System.out.println("Prime Number: \n"+prime);
				String[] primeArray=prime.split(" ");
				
				//logic for prime palindrome and displaying
				Object[] primePalindromeObject=palindromePrime(primeArray);
				String[] primePalindrome = new String[primePalindromeObject.length];
				for(int i=0;i<primePalindrome.length;i++)
				{
					primePalindrome[i]=(String)primePalindromeObject[i];
					
				}
				System.out.println("Prime Palindrome:");
				for(int i=0;i<primePalindrome.length;i++)
				{
					System.out.print(primePalindrome[i]+" ");;
					
				}
				System.out.println("");
				
				//prime anagram logic and displaying list of prime anagram numbers
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
				
				//prime anagram palindrome logic and displaying it 
				String[] primeAnagramString=new String[primeAnagram.size()];
				int k=0;
				Iterator<String> iterator=primeAnagram.iterator();
				System.out.println("Prime Anagram");
				while(iterator.hasNext())
				{
					primeAnagramString[k]=iterator.next();
					k++;
				}
				for(int i=0;i<primeAnagramString.length;i++)
				{
					System.out.print(primeAnagramString[i]+" ");
				}
				System.out.println("");
				
				String[] primeAnaPalidrome=new String[primeAnagramString.length];
				for(int i=0;i<primeAnagramString.length;i++)
				{
					for(int j=0;j<primePalindrome.length;j++)
					{
						if(primeAnagramString[i].equals(primePalindrome[j]))
						{
							primeAnaPalidrome[i]=primeAnagramString[i];
						}
						if(primeAnaPalidrome[i]==null)
						{
							primeAnaPalidrome[i]="";
						}
					
					}
				}
				System.out.println("PrimeAnagramPalindrome:" );
				for(int p=0;p<primeAnaPalidrome.length;p++)
				{
					if(!primeAnaPalidrome[p].equals(""))
					{
						System.out.print(primeAnaPalidrome[p]+" ");
					}
				}
			 
	}
	
	
	
	
	/**
	  * To find permutation of a string 
	  * @param string string to calculate permutation for
	  * @param startIndex starting index of string
	  * @param endIndex end index of string
	  */
	 public static void permute(String string, int startIndex, int endIndex)
	 {
	     if (startIndex == endIndex)
	         System.out.println(string);
	     else
	     {
	         for (int i = startIndex; i <= endIndex; i++)
	         {
	             string = swap(string,startIndex,i);
	             permute(string, startIndex+1, endIndex);
	             string = swap(string,startIndex,i);
	         }
	     }
	 }

	 /**
	  * Swap Characters at position
	  * @param a string value
	  * @param i position 1
	  * @param j position 2
	  * @return swapped string
	  */
	 public static String swap(String a, int i, int j)
	 {
	     char temp;
	     char[] charArray = a.toCharArray();
	     temp = charArray[i] ;
	     charArray[i] = charArray[j];
	     charArray[j] = temp;
	     return String.valueOf(charArray);
	 }
	
	
	
	
	public static void timeElapsed(int size)
	{
		Utility utility=new Utility();
		System.out.println("Enter element for integer array");
		int array6[]=new int[size];
		for(int i=0 ;i<array6.length;i++)
		{
			array6[i]=utility.nextInt();
		}
		System.out.println("Enter element for string array");
		String array7[]=new String[size];
		for(int i=0 ;i<array7.length;i++)
		{
			array7[i]=utility.next();
		}
		System.out.println("Enter Elements to be searched in integer array:");
		int searchInt=utility.nextInt();
		System.out.println("Enter Elements to be searched in String array:");
		String searchString=utility.next();
		
		long time1=System.nanoTime();
		int position13=binarySearchInteger(array6,searchInt);
		long time2=System.nanoTime();
		long searchTimeInt=(time2-time1);
		if(position13==-1)
		{
			System.out.println("Integer Element not found in list!!!!!!");
			
		}
		else
		{
			System.out.println("Integer Element found at position "+position13);
		}
		
		long time3=System.nanoTime();
		int position14=binarySearchString(array7, searchString);
		long time4=System.nanoTime();
		long searchTimeString=(time4-time3);
		if(position14==-1)
		{
			System.out.println("String Element not found in list!!!!!!");
			
		}
		else
		{
			System.out.println("String Element found at position "+position14);
		}
		
		long time5=System.nanoTime();
		int[] sortedArrayInt=insertionSortInteger(array6);
		long time6=System.nanoTime();
		long sortTimeInteger=time6-time5;
		System.out.println("Sorted integer element using insertion sort:");
		for(int i=0;i<sortedArrayInt.length;i++)
		{
			System.out.print(sortedArrayInt[i]+" ");
		}
		System.out.println("");
		
		long time7=System.nanoTime();
		String[] sortedArrayStr=insertSortSting(array7);
		long time8=System.nanoTime();
		long sortTimeString=time8-time7;
		System.out.println("Sorted String element using insertion sort:");
		for(int i=0;i<sortedArrayStr.length;i++)
		{
			System.out.print(sortedArrayStr[i]+" ");
		}
		System.out.println("");
		
		long time9=System.nanoTime();
		int[] sortedBubbleArray=bubbleSortInteger(array6);
		long time10=System.nanoTime();
		long sortStringTimeBubble=time10-time9;
		System.out.println("Sorted integer element using bubble Sort:");
		for(int i=0;i<sortedBubbleArray.length;i++)
		{
			System.out.print(sortedBubbleArray[i]+" ");
		}
		System.out.println("");
		
		long time11=System.nanoTime();
		String[] sortedStringBubble=bubbleSortString(array7);
		long time12=System.nanoTime();
		long sortedTimeBubble=time12-time11;
		System.out.println("Sorted string element using bubble Sort:");
		for(int i=0;i<sortedStringBubble.length;i++)
		{
			System.out.print(sortedStringBubble[i]+" ");
		}
		System.out.println("");
		
		int timetaken[]=new int[6];
		timetaken[0]=(int)searchTimeInt;
		timetaken[1]=(int)searchTimeString;
		timetaken[2]=(int)sortTimeInteger;
		timetaken[3]=(int)sortTimeString;
		timetaken[4]=(int)sortStringTimeBubble;
		timetaken[5]=(int)sortedTimeBubble;
		System.out.println("Time taken for binary search integer                         :"+timetaken[0]);
		System.out.println("Time taken for binary search String                          :"+timetaken[1]);
		System.out.println("Time taken for sorting integer array using insertion sort    :"+timetaken[2]);
		System.out.println("Time taken to sort string array using insertion sort         :"+timetaken[3]);
		System.out.println("Time taken to sort integer array using bubble sort           :"+timetaken[4]);
		System.out.println("Time taken to sort string array using bubble sort            :"+timetaken[5]);
		System.out.println("*****************************************************************************");
		System.out.println("Sorted Time in Descending order:");
		int soertedarray[]=bubbleSortInteger(timetaken);
		for(int i=5;i>=0;i--)
		{
			System.out.print(soertedarray[i]+" ");
		}
		System.out.println("");
		System.out.println("*****************************************************************************");
		System.out.println("");
	}
	
	/**
	 * purpose: Finding the result of tic tac toe game played by user and computer
	 * @param array value of game in 2Darray form
	 * @return result of the game played
	 */
	public static String ticTacToeResult(char[][] array)
	{
		String userWon="Player 1 User has won.";
		String computerWon="Player 2 Computer has won.";
		String gameDraw="It was a Draw.";
		for(int k=0;k<3;k++)
		{
			int j=0;
			for(int i=0;i<3;i++)
			{
				if(i==j && array[i][j]==array[i+1][j+1] && array[i+1][j+1]==array[i+2][j+2])
				{
					if(array[i][j]=='X')
					{
						return userWon;
					}
					else if(array[i][j]=='0')
					{
						return computerWon;
					}
				}
				if(i+j==2 && array[i-2][j]==array[i-1][j+1] && array[i-1][j+1]==array[i][j+2])
				{
					if(array[i-2][j]=='X')
					{
						return userWon;
					}
					else if(array[i-2][j]=='0')
					{
						return computerWon;
					}
				}
				
				
				if(array[i][j]==array[i][j+1] && array[i][j+1]==array[i][j+2])
				{
					if(array[i][j]=='X')
					{
						return userWon;
					}
					else if(array[i][j]=='0')
					{
						return computerWon;
					}
				}
				if(array[j][i]==array[j+1][i] && array[j+1][i]==array[j+2][i])
				{
					if(array[i][j]=='X')
					{
						return userWon;
					}
					else if(array[i][j]=='0')
					{
						return computerWon;
					}
				}
				if(array[0][2]==array[1][1] && array[1][1]==array[2][0])
				{
					if(array[0][2]=='X')
					{
						return userWon;
					}
					else if(array[0][2]=='0')
					{
						return computerWon;
					}
				}
			}
		}
		return gameDraw;
}
	
	/**
	 * purpose:To play tic tac toe game
	 * @param array of character passing board to the function
	 * @return two dimensional array of characters
	 */
	public static char[][] ticTacToe(char[][] array)
	{
		Utility utility=new Utility();
		String userWon="Player 1 User has won.";
		String computerWon="Player 2 Computer has won.";
		int row,column,randomRow=0,randomColumn=0,computer=0;
		System.out.println("**********Tic Tac Toe************");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]='*';
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println("");
			System.out.println("");
		}
		System.out.println("Player 1: User");
		System.out.println("Player 2: Computer");
		System.out.println("*********************************");
		System.out.println("Player 1 will start the game:");
		int count=0;
		do
		{
					
			do
			{
				System.out.println("Enter row and coloumn");
				row=utility.nextInt();
				column=utility.nextInt();
				
			}while(array[row][column]=='X' || array[row][column]=='0' );
			array[row][column]='X';
			count++;
			if(count==9)
			{
				break;
			}
			if(count>4)
			{
				if(ticTacToeResult(array)==userWon || ticTacToeResult(array)==computerWon)
				{
					return array;
				}
			}
			
			
			do
			{
				randomRow=ThreadLocalRandom.current().nextInt(0, 3);
				randomColumn=ThreadLocalRandom.current().nextInt(0, 3);
				if(array[randomRow][randomColumn]=='*')
				{
					array[randomRow][randomColumn]='0';
					computer++;
					count++;
					if(count>4)
					{
						if(Utility.ticTacToeResult(array)==userWon || Utility.ticTacToeResult(array)==computerWon)
						{
							return array;
						}
					}
				}
			}
			while(computer!=1);
			computer=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(array[i][j]+"  ");
				}
				System.out.println();
				System.out.println();
			}	
			System.out.println("Play next turn");
		}
		while(count<=9);
		return array;
		

	}
	
	public static String[][] deckOfCards(String[][] unShuffledCards, String[] suit, String[] rank) {
		String shuffleCards[][]=new String[52][2];
		int row=0,column=0,countRow=0;
		List<Integer> list=new ArrayList<Integer>();
		//generate random number from 0 to 51 and store that number in ArrayList store the unshuffled 
		//cards into shuffled cards
		
		Random random=new Random();
		do
		{
			row=random.nextInt(52);
			if(!list.contains(row))
			{
				list.add(row);
				shuffleCards[countRow][column]=unShuffledCards[row][column];
				shuffleCards[countRow][column+1]=unShuffledCards[row][column+1];
				countRow++;
			}
		}
		while(shuffleCards[51][1]==null);
		
		//printing shuffled cards
		System.out.println("Shuffled Cards:");
		for(int i=0;i<52;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(shuffleCards[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		//distributing cards among 4 players 
		String distributeCards[][]=new String[14][5];
		//for replacing null at intial stage with space
		for(int i=0;i<14;i++)
		{
			for(int j=0;j<5;j++)
			{
				distributeCards[i][j]="";
			}
		}
		
		//printing all the ranks in rows
		for(int i=1;i<14;i++)
		{
			distributeCards[i][0]=rank[i-1];
		}
		
		//printing all the suits in column
		for(int i=1;i<5;i++)
		{
			distributeCards[0][i]=suit[i-1];
		}
		
		//distribute the cards to 4 player one by one from the shuffled cards and store it in distribute cards
		int user=1;
		for(int k=0;k<36;k++)
		{
			for(int i=1;i<5;i++)
			{
				if(shuffleCards[k][0].equals(distributeCards[0][i]))
				{
					for(int j=0;j<13;j++)
					{
						if(shuffleCards[k][1].equals(distributeCards[j+1][0]))
						{
							distributeCards[j+1][i]="Player "+user+"";
							user++;
						}
					}
				}
			}
			if(user==5)
			{
				user=1;
			}
		}
		return distributeCards;

		
	}
	
	/**
	 * @param unShuffledCards deck of cards not shuffled
	 * @param suit Diamond,Spade,Heart,Club
	 * @param rank 2 to 10,king,queen,jack,ace
	 */
	public static void queueDeckOfCards(String unShuffledCards[][],String suit[],String rank[])
	{
		String shuffleCards[][]=new String[52][2];
		int row=0,column=0,countRow=0;
		List<Integer> list=new ArrayList<Integer>();
		Random random=new Random();
		do
		{
			row=random.nextInt(52);
			if(!list.contains(row))
			{
				list.add(row);
				shuffleCards[countRow][column]=unShuffledCards[row][column];
				shuffleCards[countRow][column+1]=unShuffledCards[row][column+1];
				countRow++;
			}
		}
		while(shuffleCards[51][1]==null);
		
		Queue<String> array[]=new Queue[4];
		int count=0;
		
		for(int i=0;i<4;i++)
		{
			array[i]=new Queue<String>(9);
		}
		//distribute 9 cards to 4 player from shuffled cards
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				array[i].enqueue(shuffleCards[count][1]+shuffleCards[count++][0]);
			}
		}
		//ordering of cards for each player
		for(int i=0;i<4;i++)
		{
			array[i].orderString();
		}
		count =1;
		Queue<String> sortedQueue[]=new Queue[4];
		
		//creating new object of queue for storing sorted cards
		for(int i=0;i<4;i++)
		{
			sortedQueue[i]=new Queue<String>(9);
		}
		
		//removing first character and string array and storing in new temp2 variable and adding it to sorted queue
		String stringArray[]=null,temp1="",temp2="";
		for(int i=0;i<4;i++)
		{
			stringArray=array[i].retrieve();
			for(int j=0;j<9;j++)
			{
				temp1=stringArray[j];
				for(int k=1;k<temp1.length();k++)
				{
					temp2=temp2+temp1.charAt(k);
				}
				sortedQueue[i].enqueue(temp2);
				temp2="";
			}
		}
		count=1;
		for(int i=0;i<4;i++)
		{
			System.out.print("Player "+(count++)+"=");
			System.out.println("[ "+sortedQueue[i].toString()+"]");
		}
}
	
	/**
	 * @param array 2D array to align space
	 * @return aligned 2Darray
	 */
	public static String[][] alignSpace(String array[][])
	{
		for(int i=0;i<14;i++)
		{
			for(int j=0;j<5;j++)
			{
				do
				{
					array[i][j]=array[i][j]+" ";
				}
				while(array[i][j].length()!=10);
			}
		}
		return array;
	}
	


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
